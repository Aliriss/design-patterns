package behavior.observer;

/**
 * @author all
 * @since 2023/7/29 18:07
 */

public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        User liBai = new User("LiBai");
        concreteSubject.attach(liBai);
        concreteSubject.attach(new User("DuFu"));
        concreteSubject.attach(new User("ZhangFei"));
        concreteSubject.attach(new User("CaoCao"));
        concreteSubject.notify("hahahaha");
        concreteSubject.detach(liBai);
        concreteSubject.notify("Today. Drink.");
    }
}
