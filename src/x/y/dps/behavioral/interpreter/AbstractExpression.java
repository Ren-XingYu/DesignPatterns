package x.y.dps.behavioral.interpreter;

/**
 * 抽象表达式
 */
public abstract class AbstractExpression {
    /**
     * 解释的操作
     * @param ctx 上下文对象
     */
    abstract void interpret(Context ctx);
}
