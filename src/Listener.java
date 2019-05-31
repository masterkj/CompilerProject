import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Hplsql.HplsqlBaseListener;
import Hplsql.HplsqlParser;
import codgen.Query;
import org.json.simple.parser.ParseException;
import sympol_table.Scope;
import sympol_table.Symbol_table;

import java.io.FileNotFoundException;
import java.io.IOException;

import static codgen.Query.JOIN_PATH;
import static codgen.Query.OUTPUT_DELIMITER;

public class Listener extends HplsqlBaseListener {
    @Override
    public void enterCreate_external_table_stmt(HplsqlParser.Create_external_table_stmtContext ctx) {
        String dataTypeName = ctx.table_name().ident().getText();
        Visitor<Variable_form> dataTypeVisitor = new Visitor<>();

        try {
            Data_Type.addDataType(dataTypeName, (Variable_form) dataTypeVisitor.visit(ctx));
        } catch (Data_Type.TableDeclaredException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void enterSelect_stmt(HplsqlParser.Select_stmtContext ctx) {

        //add tables
        Query.fromTable = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().from_clause().from_table_clause().from_table_name_clause().table_name().ident().getText();

        //CHECK: is it a DT
        if (!(Data_Type.isDT(Query.fromTable)))
            try {
                throw new Data_Type.DataTypeNotFoundException(Query.fromTable);
            } catch (Data_Type.DataTypeNotFoundException e) {
                e.printStackTrace();
            }

        HplsqlParser.From_join_clauseContext joinTable;
        if ((joinTable = ctx.fullselect_stmt().fullselect_stmt_item().get(0).subselect_stmt().from_clause().from_join_clause(0)) != null) {
            Query.joinTable = joinTable.from_table_clause().from_table_name_clause().table_name().ident().getText();

            if (!(Data_Type.isDT(Query.joinTable)))
                try {
                    throw new Data_Type.DataTypeNotFoundException(Query.joinTable);
                } catch (Data_Type.DataTypeNotFoundException e) {
                    e.printStackTrace();
                }

            Query.isJoin = true;
        }

        //the boolean var {{end shufflePhase}} will be false
        //so there will not do any map reduce in this visit
        new Visitor().visit(ctx);

        // add join result table temporary to the globalArray
        try {
            Query.joinResultTable = Query.fromTable + "_" + Query.joinTable;
            Variable_form variable_form = new Variable_form(null);
            variable_form.setHDFSPath(Query.TEMP_PATH + JOIN_PATH);
            variable_form.setDelimiter(OUTPUT_DELIMITER);
            Data_Type.set_DT(Query.joinResultTable, variable_form);
        } catch (Data_Type.TableDeclaredException | FileNotFoundException e) {
            e.printStackTrace();
        }


        //add keys
        if (ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().group_by_clause() != null) {
            ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().group_by_clause().expr().forEach(e -> {
                if (e.expr_agg_window_func() != null) {
                    try {
                        throw new Visitor.GroupByAggriException();
                    } catch (Visitor.GroupByAggriException e1) {
                        e1.printStackTrace();
                    }
                }
                if (e.expr_func() != null)
                    try {
                        if (e.expr_func().expr_func_params().func_param(0).ident().non_reserved_words() != null) {
                            Query.keys.add(e.expr_func().expr_func_params().func_param(0).ident().getChild(2).getText());
                        }
                    } catch (NullPointerException e1) {
                        Query.keys.add(e.expr_func().expr_func_params().func_param(0).ident().getText());
                    }
                try {
                    if (e.expr_atom().ident().non_reserved_words() != null) {
                        Query.keys.add(e.expr_atom().ident().getChild(2).getText());
                    }
                } catch (NullPointerException e1) {
                    try {
                        if (e.expr_atom().ident() != null)
                            Query.keys.add(getAttributeName(e));
                    } catch (NullPointerException e2) {
                    }
                }
            });

            //add values
            ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().select_list().select_list_item().forEach(e -> {
                Query.addValue(getValue(e));
                HplsqlParser.Expr_atomContext column;
                if ((column = e.expr().expr_atom()) != null) {
                    if (!Query.isJoin) {
                        if (!Query.keys.contains(column.getText())) {
                            try {
                                throw new Visitor.GroupByException(column.getText());
                            } catch (Visitor.GroupByException e1) {
                                e1.printStackTrace();
                            }
                        }
                    } else {
                        if (!Query.keys.contains(column.ident().getChild(2).getText()))
                            try {
                                throw new Visitor.GroupByException(column.getText());
                            } catch (Visitor.GroupByException e1) {
                                e1.printStackTrace();
                            }
                    }
                }
            });
        } else
            Query.keys.add(Query.fromTable);

        // order by
        if (ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().order_by_clause() != null) {
            if (ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().order_by_clause().T_DESC() != null)
                Query.T_DESC = true;
            ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().order_by_clause().expr().forEach(e -> {
                if (e.expr_func() != null)
                    try {
                        if (e.expr_func().expr_func_params().func_param(0).ident().non_reserved_words() != null) {
                            Query.orders.add(e.expr_func().expr_func_params().func_param(0).ident().getChild(2).getText());
                        }
                    } catch (NullPointerException e1) {
                        Query.orders.add(e.expr_func().expr_func_params().func_param(0).ident().getText());
                    }
                if (e.expr_agg_window_func() != null)
                    try {
                        if (e.expr_agg_window_func().agg_param().expr().expr_func() != null)
                            try {
                                if (e.expr_agg_window_func().agg_param().expr().expr_func().expr_func_params().func_param(0).ident().non_reserved_words() != null)
                                    Query.orders.add(e.expr_agg_window_func().agg_param().expr().expr_func().expr_func_params().func_param(0).ident().getChild(2).getText());
                            } catch (NullPointerException e1) {
                                Query.orders.add(e.expr_agg_window_func().agg_param().expr().expr_func().expr_func_params().func_param(1).ident().getText());
                            }
                        else
                            Query.orders.add(e.expr_agg_window_func().agg_param().expr().expr_atom().ident().getText());
                    } catch (NullPointerException e1) {
                    }
                try {
                    if (e.expr_atom().ident().non_reserved_words() != null) {
                        Query.orders.add(e.expr_atom().ident().getChild(2).getText());
                    }
                } catch (NullPointerException e1) {
                }
                try {
                    if (e.expr_atom().ident() != null)
                        Query.orders.add(e.expr_atom().ident().getText());
                } catch (NullPointerException e2) {
                }
            });
        }


        try {
            Query.prepareShuffledFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if(Query.EXPLAIN_PLAN) System.out.println("\n"+"---------- REDUCE phase  ----------");

        //to reduce phase
        new Visitor().visit(ctx);
    }

    private String getAttributeName(HplsqlParser.ExprContext e) {
        if (Query.isJoin)
            return e.expr_atom().ident().getChild(2).getText();
        return e.expr_atom().ident().getText();
    }

    private String getValue(HplsqlParser.Select_list_itemContext e) {
        HplsqlParser.Expr_agg_window_funcContext agg_function;
        // if it's not an aggregation function -> ignore
        if ((agg_function = e.expr().expr_agg_window_func()) != null) {
            //if agg don't have row function
            if (agg_function.agg_param().expr().expr_atom() != null)
                if (Query.isJoin)
                    try {
                        String value = agg_function.agg_param().expr().expr_atom().ident().getChild(2).getText();
                        String tableVar = agg_function.agg_param().expr().expr_atom().ident().getChild(0).getText();

                        String tableName = Symbol_table.getTable(tableVar).getTableName();
                        if (Data_Type.isAttribute(tableName, value))
                            return value;
                    } catch (Scope.NotTableVarException | Scope.VarNotExistedException | Data_Type.DataTypeNotFoundException e1) {
                        e1.printStackTrace();
                    }
                else
                    return agg_function.agg_param().expr().expr_atom().ident().getText();

            HplsqlParser.Expr_funcContext row_func;
            //if agg have row function
            if ((row_func = agg_function.agg_param().expr().expr_func()) != null)
                return getValue(row_func);

        }
        return null;
    }

    private String getValue(HplsqlParser.Expr_funcContext row_func) {
        HplsqlParser.IdentContext value;
        if ((value = row_func.expr_func_params().func_param(0).ident()) != null)
            if (!Query.isJoin)
                return value.getText();
            else {
                try {
                    String symbol_value = value.getChild(2).getText();
                    String symbol_tableName = value.getChild(0).getText();

                    String tableName = Symbol_table.getTable(symbol_tableName).getTableName();
                    if (Data_Type.isAttribute(tableName, symbol_value))
                        return symbol_value;
                } catch (Scope.NotTableVarException | Scope.VarNotExistedException | Data_Type.DataTypeNotFoundException e1) {
                    e1.printStackTrace();
                }
            }

        return getValue(row_func.expr_func_params().func_param(0).expr().expr_func());
    }


    @Override
    public void enterWrite_stmt(HplsqlParser.Write_stmtContext ctx) {
        if (ctx.ident(0).getText().equals("CLEAR")) {
            try {
                Data_Type.clearDataTypeTables();
                System.out.println("DATA_TYPE cleared");
            } catch (IOException | ParseException | Data_Type.TableDeclaredException e) {
                e.printStackTrace();
            }
        }
    }


}