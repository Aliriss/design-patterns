package behavior.memento.blackbox;

/**
 * 备忘录管理对象
 * @author all
 * @since 2023/8/6 18:57
 */

public class RoleStateCaretaker {
    Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
