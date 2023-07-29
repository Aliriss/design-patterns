package construct.decorator;

/**
 * 炒面，具体构件角色
 * @author all
 * @since 2023/7/20 8:24
 */

public abstract class FiredNoodles extends FastFood {
    public FiredNoodles() {
        super(8, "炒面");
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
    // 排序算法


}
