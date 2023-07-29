package behavior.responsibility;

/**
 * @author all
 * @since 2023/7/27 15:33
 */

public class Client {
    public static void main(String[] args) {

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNext(manager);
        manager.setNext(generalManager);
        System.out.println("====================New Request====================");
        groupLeader.submit(new LeaveRequest("Zhang San", 1, "Play Games."));
        System.out.println("====================New Request====================");
        groupLeader.submit(new LeaveRequest("Li Si", 2, "Sleep."));
        System.out.println("====================New Request====================");
        groupLeader.submit(new LeaveRequest("Wang Wu", 6, "Travel round the world."));
    }
}
