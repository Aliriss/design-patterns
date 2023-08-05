package behavior.visitor.dispatch.mixeddispatch;

/**
 * @author heyabo
 * @since 2023/8/5 17:21
 */

public class Cat extends Animal {
    @Override
    public void execute(Executor executor) {
        executor.execute(this);
    }
}
