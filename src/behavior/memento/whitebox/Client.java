package behavior.memento.whitebox;

/**
 * @author all
 * @since 2023/8/6 18:40
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("==========备忘录模式, 白盒==========");
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();

        GameRole role = new GameRole();
        role.initState();
        roleStateCaretaker.setRoleStateMemento(role.saveState());
        role.display();
        role.fight();
        role.display();

        System.out.println("\nrollback");
        role.recoverState(roleStateCaretaker.getRoleStateMemento());
        role.display();
    }
}
