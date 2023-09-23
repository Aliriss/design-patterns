package feature.java8.fp.demo4;

/**
 * @author all
 * @since 2023/9/20 19:32
 */

public class ProduceFunction {
    static FuncS produce() {
        return String::toLowerCase;
    }

    public static void main(String[] args) {
        FuncS f = produce();
        System.out.println(f.apply("DUWEIYUEILOVEYOU"));
    }
}
