package behavior.observer;

/**
 * 抽象观察者接口
 * @author all
 * @since 2023/7/29 17:57
 */

public interface Observer {
    /**
     * 更新
     * @param msg message
     */
    void update(String msg);
}
