package behavior.observer;

/**
 * 具体观察者
 * @author all
 * @since 2023/7/29 18:00
 */

public class User implements Observer{
    private String name;
    public User(String name) {
        this.name = name;
    }
    public User() {
        this("未知");
    }
    /**
     * 更新
     *
     * @param msg message
     */
    @Override
    public void update(String msg) {
        System.out.println("User " + name + " get msg: " + msg);
    }
}
