package behavior.visitor.dispatch.dynamicdispatch;

/**
 * @author heyabo
 * @since 2023/8/5 17:21
 */

public class Dog extends Animal {
    @Override
    public void execute() {
        System.out.println("Dog");
    }
}
