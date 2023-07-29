package behavior.state.usingStatePattern;

/**
 * @author all
 * @since 2023/7/29 3:37
 */

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.RUNNING_LIFT_STATE);

        context.open();
        context.close();
        // context.run();
        context.open();
        context.stop();

    }
}
