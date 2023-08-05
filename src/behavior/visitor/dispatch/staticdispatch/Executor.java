package behavior.visitor.dispatch.staticdispatch;

/**
 * @author heyabo
 * @since 2023/8/5 17:26
 */

public class Executor {
    public void execute(Animal animal) {
        System.out.println("Animal");
    }

    public void execute(Cat cat) {
        System.out.println("Cat");
    }

    public void execute(Dog dog) {
        System.out.println("Dog");
    }
}
