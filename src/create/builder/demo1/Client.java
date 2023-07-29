package create.builder.demo1;

/**
 * @author all
 * @since 2023/7/18 16:01
 */

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        System.out.println(director.construct());
    }
}
