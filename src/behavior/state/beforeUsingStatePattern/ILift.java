package behavior.state.beforeUsingStatePattern;

/**
 * @author all
 * @since 2023/7/28 8:29
 */

public interface ILift {
    int OPENING_DOOR_STATE = 1;
    int CLOSING_DOOR_STATE = 2;
    int RUNNING_LIFT_STATE = 3;
    int STOPPING_LIFT_STATE = 4;


    /**
     * 开门
     */
    void open();

    /**
     * 关门
     */
    void close();

    /**
     * 运行
     */
    void run();

    /**
     * 停止
     */
    void stop();
}
