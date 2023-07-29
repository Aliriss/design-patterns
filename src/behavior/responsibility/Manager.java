package behavior.responsibility;

/**
 * @author all
 * @since 2023/7/27 15:30
 */

public class Manager extends Handler{
    public Manager() {
        super(NUM_ONE, NUM_THREE);
    }
    /**
     * 审批
     *
     * @param leaveRequest 假条
     */
    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest);
        System.out.println("Manager consents.");
    }
}
