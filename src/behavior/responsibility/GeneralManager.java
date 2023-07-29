package behavior.responsibility;

/**
 * @author all
 * @since 2023/7/27 15:32
 */

public class GeneralManager extends Handler{
    public GeneralManager() {
        super(NUM_THREE, NUM_THREE);
    }
    /**
     * 审批
     *
     * @param leaveRequest 假条
     */
    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest);
        System.out.println("GeneralManager consents.");
    }
}
