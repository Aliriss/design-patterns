package behavior.state.usingStatePattern;


/**
 * 停止状态
 * @author all
 * @since 2023/7/29 3:04
 */

public class StoppingState extends LiftState {
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
        System.out.println("Lift has stopped and the door is closing...");
        super.getContext().setLiftState(Context.CLOSING_DOOR_STATE);
        super.getContext().close();
    }

    /**
     * run
     */
    @Override
    public void run() {
        System.out.println("Lift has stopped and lift is running...");
        super.getContext().setLiftState(Context.RUNNING_LIFT_STATE);
        super.getContext().run();
    }

    /**
     * stop
     */
    @Override
    public void stop() {
        System.out.println("Lift has stopped.");
    }
}

