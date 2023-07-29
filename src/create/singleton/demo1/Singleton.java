package create.singleton.demo1;

/**
 * 普通
 * @author all
 * @since 2023/6/19 23:07
 */

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
