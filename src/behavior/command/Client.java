/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.command;

/**
 * @author all
 * @since 2023/7/26 15:14
 */

public class Client {
    public static void main(String[] args) {
        // 初始化
        Waitor waitor = new Waitor();
        SeniorChef seniorChef = new SeniorChef();

        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoods("Fired Potato", 5);
        order1.setFoods("Pepsi Cola", 1);
        waitor.setCommand(new OrderCommand(seniorChef, order1));
        waitor.orderUp();


        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoods("Tomato and Egg Noodles", 5);
        order2.setFoods("Sprite", 1);
        waitor.setCommand(new OrderCommand(seniorChef, order2));
        waitor.orderUp();

    }
}
