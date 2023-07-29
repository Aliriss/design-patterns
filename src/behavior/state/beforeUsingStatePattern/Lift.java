package behavior.state.beforeUsingStatePattern;

/**
 * @author all
 * @since 2023/7/28 8:32
 */

public class Lift implements ILift {
    private int liftState;
    private int doorState;

    public Lift(int liftState, int doorState) {
        this.liftState = liftState;
        this.doorState = doorState;
    }

    public Lift() {
        this(STOPPING_LIFT_STATE, CLOSING_DOOR_STATE);
    }

    @Override
    public void open() {
        if (liftState == STOPPING_LIFT_STATE && doorState == CLOSING_DOOR_STATE) {
            this.doorState = OPENING_DOOR_STATE;
            System.out.println("Lift door is opening...");
        }
    }

    @Override
    public void close() {
        if (liftState == STOPPING_LIFT_STATE && doorState == OPENING_DOOR_STATE) {
            this.doorState = CLOSING_DOOR_STATE;
            System.out.println("Lift door is closing...");
        }
    }

    @Override
    public void run() {
        if (liftState == STOPPING_LIFT_STATE && doorState == CLOSING_DOOR_STATE) {
            this.liftState = RUNNING_LIFT_STATE;
            System.out.println("Lift is running...");
        }
    }

    @Override
    public void stop() {
        if (liftState == RUNNING_LIFT_STATE) {
            this.liftState = STOPPING_LIFT_STATE;
            System.out.println("Lift is stopping...");
        }
    }
}
