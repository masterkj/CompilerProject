import Hplsql.HplsqlParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

public class Ast {

    private boolean ignoringWrappers = true;

    public void print(RuleContext ctx) {
        explore(ctx, 0);
    }

    private void explore(RuleContext ctx, int indentation) {
        boolean toBeIgnored = ignoringWrappers
                && ctx.getChildCount() == 1
                && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            int s = ctx.getRuleIndex();

            String ruleName = HplsqlParser.ruleNames[s];
            for (int i = 0; i < indentation; i++) {
                System.out.print("      ");
            }
            if (ruleName != "semicolon_stmt" && ctx.getChildCount() > 1)
                System.out.println(ruleName);

            if (ctx.getChildCount() == 1)
            {
                if(ctx.getText() == ";")
                    return;
                else
                System.out.println(ctx.getText());
            }



        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext) element, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
}