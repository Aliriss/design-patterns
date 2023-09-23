package feature.java8.fp.demo5;

import java.util.function.Function;

/**
 * @author all
 * @since 2023/9/23 11:36
 */

public class ConsumeFunction {
    static Two consume(Function<One, Two> oneTwo) {
        return oneTwo.apply(new One());
    }
    public static void main(String[] args) {
        Two two = consume(one -> new Two());
        System.out.println(two);
    }
}
