package behavior.state.usingStatePattern;

/**
 * 抽象状态类
 * @author all
 * @since 2023/7/29 2:31
 */

public abstract class LiftState {
    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * open
     */
    public abstract void open();

    /**
     * close
     */
    public abstract void close();

    /**
     * run
     */
    public abstract void run();

    /**
     * stop
     */
    public abstract void stop();
}
