package create.singleton.demo5;

/**
 * @author all
 * @since 2023/6/19 23:17
 */

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton == singleton2);
    }
}
