package behavior.interpreter;

/**
 * 加法表达式
 * @author all
 * @since 2023/8/11 18:47
 */

public class Plus extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 解释,计算
     *
     * @param context context
     * @return int
     */
    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left + " + " + right + ')';
    }
}
