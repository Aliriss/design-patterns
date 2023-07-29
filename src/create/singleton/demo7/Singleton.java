package create.singleton.demo7;

import java.io.Serializable;

/**
 * 单例
 * @author all
 * @since 2023/6/19 23:07
 */

public class Singleton implements Serializable {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
