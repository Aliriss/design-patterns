package behavior.state.usingStatePattern;

/**
 * 环境角色类
 * @author all
 * @since 2023/7/29 3:02
 */

public class Context {

    /**
     * 运行状态
     */
    public static final RunningState RUNNING_LIFT_STATE = new RunningState();
    /**
     * 停止状态
     */
    public static final StoppingState STOPPING_LIFT_STATE = new StoppingState();
    /**
     * 开门状态
     */
    public static final OpeningState OPENING_DOOR_STATE = new OpeningState();
    /**
     * 关门状态
     */
    public static final ClosingState CLOSING_DOOR_STATE = new ClosingState();


    /**
     * 当前电梯的状态变量
     */

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        // 设置当前状态中的context对象
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }
    public void run() {
        this.liftState.run();
    }
    public void stop() {
        this.liftState.stop();
    }
}
