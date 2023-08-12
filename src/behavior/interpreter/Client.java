package behavior.interpreter;

/**
 * @author all
 * @since 2023/8/12 9:20
 */

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable var1 = new Variable("var1");
        Variable var2 = new Variable("var2");
        Variable var3 = new Variable("var3");
        Variable var4 = new Variable("var4");

        context.assign(var1, 1);
        context.assign(var2, 2);
        context.assign(var3, 3);
        context.assign(var4, 4);

        AbstractExpression ae = new Minus(var1, new Plus(var2, new Minus(var3, var4)));
        ae.interpret(context);

        System.out.println(ae + " = " + ae.interpret(context));
    }
}
