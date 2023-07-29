package construct.decorator;

/**
 * 快餐类，抽象构件角色
 * @author all
 * @since 2023/7/20 8:24
 */

public abstract class FastFood {
    /**
     * 价格
     */
    private float price;

    /**
     * 描述
     */
    private String desc;


    /**
     * 消费
     * @return String
     */
    public abstract float cost();

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
