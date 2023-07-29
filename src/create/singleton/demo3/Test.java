package create.singleton.demo3;

/**
 * @author all
 * @since 2023/6/19 23:17
 */

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
    }
}
