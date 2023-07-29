package behavior.responsibility;

/**
 * 小组长类，具体处理者
 * @author all
 * @since 2023/7/27 15:24
 */

public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, NUM_ONE);
    }
    /**
     * 审批
     *
     * @param leaveRequest 假条
     */
    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest);
        System.out.println("Group leader consents.");
    }
}
