package java8features.functionalprogramming.demo1;

/**
 * @author all
 * @since 2023/9/19 17:28
 */

public class Soft implements Strategy {
    /**
     * msg
     *
     * @param msg msg
     * @return str
     */
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}
