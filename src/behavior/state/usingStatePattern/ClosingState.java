package behavior.state.usingStatePattern;

/**
 * 关门状态
 * @author all
 * @since 2023/7/29 3:04
 */

public class ClosingState extends LiftState {
    /**
     * open
     */
    @Override
    public void open() {
        System.out.println("The door is opening...");
        super.getContext().setLiftState(Context.OPENING_DOOR_STATE);
        super.getContext().open();
    }

    /**
     * close
     */
    @Override
    public void close() {
        System.out.println("The door has closed.");
    }

    /**
     * run
     */
    @Override
    public void run() {
        System.out.println("Lift is running...");
        super.getContext().setLiftState(Context.RUNNING_LIFT_STATE);
        super.getContext().run();
    }

    /**
     * stop
     */
    @Override
    public void stop() {
        System.out.println("Lift is stopping...");
        super.getContext().setLiftState(Context.STOPPING_LIFT_STATE);
        super.getContext().stop();
    }
}

