package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色
 * @author all
 * @since 2023/7/29 18:00
 */

public class ConcreteSubject implements Subject {

    private final List<Observer> observerList = new ArrayList<>();

    /**
     * 添加观察者对象（订阅者对象）
     *
     * @param observer 观察者/订阅者
     */
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除订阅者
     *
     * @param observer 观察者/订阅者
     */
    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知观察者（订阅者）
     *
     * @param msg message
     */
    @Override
    public void notify(String msg) {
        observerList.forEach(observer -> observer.update(msg));
    }
}
