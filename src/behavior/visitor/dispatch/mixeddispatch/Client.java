package behavior.visitor.dispatch.mixeddispatch;

/**
 * @author heyabo
 * @since 2023/8/5 17:21
 */

public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        Executor executor = new Executor();

        animal.execute(executor);
        cat.execute(executor);
        dog.execute(executor);
    }
}
