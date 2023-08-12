package behavior.interpreter;

/**
 * 抽象表达式
 * @author all
 * @since 2023/8/11 18:47
 */

public abstract class AbstractExpression {

    /**
     * 解释,计算
     * @param context context
     * @return int
     */
    public abstract int interpret(Context context);
}
