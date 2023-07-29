package behavior.state.beforeUsingStatePattern;

/**
 * @author all
 * @since 2023/7/29 1:38
 */

public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.run();
        lift.stop();
        lift.open();
        lift.close();
        lift.run();
        lift.open();
    }
}
