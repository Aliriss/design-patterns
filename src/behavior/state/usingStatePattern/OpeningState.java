package behavior.state.usingStatePattern;

/**
 * 开门状态
 * @author all
 * @since 2023/7/29 3:04
 */

public class OpeningState extends LiftState{
    /**
     * open
     */
    @Override
    public void open() {
        System.out.println("The door has opened.");
    }

    /**
     * close
     */
    @Override
    public void close() {
        System.out.println("Lift is closing...");
        super.getContext().setLiftState(Context.CLOSING_DOOR_STATE);
        super.getContext().close();
    }

    /**
     * run
     */
    @Override
    public void run() {
        System.out.println("Lift has opened, can't run.");
    }

    /**
     * stop
     */
    @Override
    public void stop() {
        System.out.println("Lift has stopped.");
    }
}

