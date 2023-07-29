/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.decorator;

/**
 * @author all
 * @since 2023/7/20 11:54
 */

public abstract class Garnish extends FastFood {

    private final FastFood fastFood;

    public Garnish(FastFood food, float price, String desc) {
        super(price, desc);
        this.fastFood = food;
    }

    /**
     * 消费
     *
     * @return String
     */
    @Override
    public float cost() {
        return fastFood.getPrice();
    }

    public FastFood getFastFood() {
        return fastFood;
    }
}
