package behavior.visitor.dispatch.mixeddispatch;

/**
 * @author heyabo
 * @since 2023/8/5 17:20
 */

public class Animal {
    public void execute(Executor executor) {
        executor.execute(this);
    }
}
