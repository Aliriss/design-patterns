/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.decorator;

/**
 * @author all
 * @since 2023/7/20 12:33
 */

public class Bacon extends Garnish {
    public Bacon(FastFood food) {
        super(food, 2, "培根");
    }

    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }

    public float getPrice() {
        return super.getPrice() + getFastFood().getPrice();
    }
}
