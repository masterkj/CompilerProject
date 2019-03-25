import sympol_table.Variable;

import Hplsql.*;

import java.util.Hashtable;

public class Listener extends HplsqlBaseListener {
    private Hashtable<String, Variable> queued = new Hashtable<>();

    @Override
    public void enterBegin_end_block(HplsqlParser.Begin_end_blockContext ctx) {
//        if (queued.isEmpty())
//            Symbol_table.initNewScobe();
//        else {
//            Symbol_table.initNewScobe(queued);
//            queued.clear();
//        }
    }

//    @Override
//    public void enterBegin_end_block_function(HqlParser.Begin_end_block_functionContext ctx) {
//        if (queued.isEmpty())
//            Symbol_table.initNewScobe();
//        else {
//            Symbol_table.initNewScobe(queued);
//            queued.clear();
//        }
//    }

//    @Override
//    public void exitBegin_end_block_function(HqlParser.Begin_end_block_functionContext ctx) {
//        Symbol_table.exitFromScobe();
//    }

//    @Override
//    public void enterInit_expression_cpp_stmt(HqlParser.Init_expression_cpp_stmtContext ctx) {
//        Double result = 0.0;
//        if (ctx.set_value() != null) {
//            result = visitor.visit(ctx.set_value().expr_cpp());
//        }
//        Symbol_table.initVariable(ctx.declear_variable().ident().getText(), ctx.declear_variable().dtype().getText(), result);
//    }

//    @Override
//    public void enterFor_begin_condition(HqlParser.For_begin_conditionContext ctx) {
//        //to commint if ...
//        Double result = 0.0;
//        if (ctx.set_value() != null) {
//            result = (Double) visitor.visit(ctx);
//        }
//        insetInQuedTable(ctx.ident().getText(), ctx.dtype().getText(), result);
//    }

//    @Override
//    public void enterCreate_function_cpp(HqlParser.Create_function_cppContext ctx) {
//        List<Variable> parameters = new ArrayList<>();
//        if (ctx.parameters() != null) {
//            Parameters parametersVisitor = new Parameters();
//            parameters = parametersVisitor.visit(ctx.parameters());
//        }
//        System.out.println(parameters);
////        Symbol_table.initFuntion(ctx.pre_creation().variable_name().getText(), ctx.pre_creation().dtype().getText(), parameters);
//
//    }

//    @Override
//    public void exitBegin_end_block(HqlParser.Begin_end_blockContext ctx) {
//        Symbol_table.exitFromScobe();
//    }


    @Override
    public void exitBegin_end_block(HplsqlParser.Begin_end_blockContext ctx) {
        super.exitBegin_end_block(ctx);
    }

//    @Override
////    public void enterCreate_table_stmt(HqlParser.Create_table_stmtContext ctx) {
////        Variables variables = new Variables();
////        if (ctx.create_table_definition() != null) {
////            AttriputeVisitore visitore = new AttriputeVisitore();
////            variables = visitore.visit(ctx.create_table_definition().create_table_columns());
////        }
////        Data_Type.set_DT(ctx.table_name().getText(), variables);
////        Data_Type.get_DT(ctx.table_name().getText()).show();
////        Object object = new Object();
////    }


    @Override
    public void enterCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx) {
        super.enterCreate_table_stmt(ctx);
    }

//    @Override
//    public void enterParameter(HqlParser.ParameterContext ctx) {
//        Double result = 0.0;
//        if (ctx.set_value() != null) {
//            result = (Double) visitor.visit(ctx);
//        }
//        insetInQuedTable(ctx.ident().getText(), ctx.dtype().getText(), result);
//    }


//    private void insetInQuedTable(String name, String type, Object o) {
//        queued.put(name, new Variable(type, o));
//    }
}
