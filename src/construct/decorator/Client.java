/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.decorator;

/**
 * @author all
 * @since 2023/7/20 11:41
 */

public class Client {
    public static void main(String[] args) {
        FastFood fastFood = new FiredRice();
        System.out.println(fastFood.getDesc() + ": " + fastFood.getPrice() + "元");

        fastFood = new Agg(fastFood);
        System.out.println(fastFood.getDesc() + ": " + fastFood.getPrice() + "元");

        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc() + ": " + fastFood.getPrice() + "元");
    }
}
