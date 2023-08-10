package behavior.memento.whitebox;

/**
 * 备忘录管理对象
 * @author all
 * @since 2023/8/6 18:57
 */

public class RoleStateCaretaker {
    RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
