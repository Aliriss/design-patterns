package behavior.state.usingStatePattern;

/**
 * 运行状态
 * @author all
 * @since 2023/7/29 3:04
 */

public class RunningState extends LiftState{
    /**
     * open
     */
    @Override
    public void open() {
        System.out.println("Lift has run, can't open the door.");
    }

    /**
     * close
     */
    @Override
    public void close() {
        System.out.println("Lift has run and the door has closing.");
    }

    /**
     * run
     */
    @Override
    public void run() {
        System.out.println("Lift has run.");
    }

    /**
     * stop
     */
    @Override
    public void stop() {
        System.out.println("List is stopping...");
        super.getContext().setLiftState(Context.STOPPING_LIFT_STATE);
        super.getContext().stop();
    }
}

