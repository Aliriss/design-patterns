package create.singleton.demo3;

/**
 * 双重检查锁
 * @author all
 * @since 2023/6/19 23:07
 */

public class Singleton {

    private static volatile Singleton instance;


    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
