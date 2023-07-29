package construct.adapter.classAdapter;

/**
 * @author all
 * @since 2023/7/19 16:26
 */

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 读sd卡数据
        System.out.println(computer.readSD(new SDCardImpl()));
        // 读TF卡数据
        System.out.println(computer.readSD(new SDAdapterTF()));
    }
}
