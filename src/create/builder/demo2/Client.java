package create.builder.demo2;

/**
 * @author all
 * @since 2023/7/18 16:42
 */

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder().cpu("haha_cpu").screen("haha_screen").memory("haha_memory").mainboard("haha_mainboard").build();
        System.out.println(phone);
    }
}
