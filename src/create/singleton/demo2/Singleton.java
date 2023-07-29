package create.singleton.demo2;

/**
 * 静态代码块
 * @author all
 * @since 2023/6/19 23:07
 */

public class Singleton {

    private static Singleton instance = null;

    static {
        instance = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
