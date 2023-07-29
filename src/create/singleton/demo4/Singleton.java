package create.singleton.demo4;

/**
 * 静态内部类：
 * <ol>
 *     <li>保证了多线程安全</li>
 *     <li>没有资源浪费</li>
 * </ol>
 *
 * @author all
 * @since 2023/6/19 23:07
 */

public class Singleton {

    private Singleton() {}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
