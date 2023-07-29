package behavior.observer;

/**
 * 抽象主题角色
 * @author all
 * @since 2023/7/29 17:56
 */

public interface Subject {
    /**
     * 添加观察者对象（订阅者对象）
     * @param observer 观察者/订阅者
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer 观察者/订阅者
     */
    void detach(Observer observer);

    /**
     * 通知观察者（订阅者）
     * @param msg 消息
     */
    void notify(String msg);

}
