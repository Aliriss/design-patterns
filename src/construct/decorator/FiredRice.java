package construct.decorator;

/**
 * 炒饭，具体构件角色
 * @author all
 * @since 2023/7/20 8:27
 */

public class FiredRice extends FastFood {

    public FiredRice() {
        super(10, "炒饭");
    }

    /**
     * 消费
     *
     * @return String
     */
    @Override
    public float cost() {
        return super.getPrice();
    }
}
