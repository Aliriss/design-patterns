package behavior.responsibility;

/**
 * 抽象处理者类
 * @author all
 * @since 2023/7/27 15:15
 */

public abstract class Handler {
    protected static final int NUM_ONE = 1;
    protected static final int NUM_THREE = 3;
    protected static final int NUM_SEVEN = 7;

    /**
     * 处理区间
     */
    private int numStart;
    private int numEnd;

    /**
     * 后级
     */
    private Handler next;

    protected Handler(int numStart) {
        this.numStart = numStart;
    }

    protected Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    /**
     * 审批
     * @param leaveRequest 假条
     */
    protected abstract void handleLeave(LeaveRequest leaveRequest);

    /**
     * 提交
     * @param leaveRequest 假条
     */
    protected final void submit(LeaveRequest leaveRequest) {
        // 审批
        this.handleLeave(leaveRequest);
        if (this.next != null && leaveRequest.getDay() > this.getNumEnd()) {
            // 移交下级
            this.next.submit(leaveRequest);
        } else {
            System.out.println("submit successfully!");
        }
    }

    public int getNumStart() {
        return numStart;
    }

    public void setNumStart(int numStart) {
        this.numStart = numStart;
    }

    public int getNumEnd() {
        return numEnd;
    }

    public void setNumEnd(int numEnd) {
        this.numEnd = numEnd;
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}
