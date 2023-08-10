package behavior.memento.blackbox;

/**
 * @author all
 * @since 2023/8/6 18:40
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("==========备忘录模式, 黑盒==========");
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();

        GameRole role = new GameRole();
        role.initState();
        roleStateCaretaker.setMemento(role.saveState());
        role.display();
        role.fight();
        role.display();

        System.out.println("\nrollback");
        role.recoverState(roleStateCaretaker.getMemento());
        role.display();
    }
}
