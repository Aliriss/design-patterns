package behavior.responsibility;

/**
 * @author all
 * @since 2023/7/27 15:14
 */

public class LeaveRequest {
    /**
     * name
     */
    private String name;
    /**
     * day
     */
    private int day;
    /**
     * content
     */
    private String content;

    public LeaveRequest(String name, int day, String content) {
        this.name = name;
        this.day = day;
        this.content = content;
    }

    public LeaveRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Request: " + name + " will leave " + day + " days.\nDesc: " + content + ".";
    }
}
