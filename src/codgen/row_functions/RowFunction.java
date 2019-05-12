package codgen.row_functions;


import Hplsql.HplsqlParser;

import java.util.ArrayList;

public interface RowFunction {
    ArrayList<String> flat(ArrayList<String> values);

    public static RowFunction choseFunction(HplsqlParser.Expr_funcContext ctx) {
        if (ctx.getChild(0).getText().equals("LEN") || ctx.getChild(0).getText().equals("len") || ctx.getChild(0).getText().equals("Len"))
            return new Len();
        if (ctx.getChild(0).getText().equals("substr"))
            return new Substr(ctx.expr_func_params().func_param(1).getText(),ctx.expr_func_params().func_param(2).getText());
        if (ctx.getChild(0).getText().equals("round")|| ctx.getChild(0).getText().equals("Round") || ctx.getChild(0).getText().equals("ROUND")){
            try {
                String factor = ctx.expr_func_params().getChild(4).getText();
                String degree=ctx.expr_func_params().getChild(2).getText();
                return new Round(degree,factor);

            }catch (NullPointerException e){
                try{
                    String degree=ctx.expr_func_params().getChild(2).getText();
                    return new Round(degree);
                }
                catch (NullPointerException v){
                    return new Round();
                }
            }
        }
        return null;
    }

    public static String getName(RowFunction rowFunction) {
        if (rowFunction instanceof Len)
            return "len";
        if (rowFunction instanceof Substr)
            return "subStr";
        if (rowFunction instanceof Round)
            return "round";
        return null;

    }
}
