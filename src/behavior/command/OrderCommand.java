/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.command;

import java.util.Map;

/**
 * @author all
 * @since 2023/7/26 15:03
 */

public class OrderCommand implements Command{
    /**
     * 厨师
     */
    private SeniorChef receiver;
    /**
     * 订单
     */
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    /**
     *
     */
    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + " has a order.");
        Map<String, Integer> foods = order.getFoods();
        for (String key : foods.keySet()) {
            receiver.cook(key, foods.get(key));
        }
        System.out.println(order.getDiningTable() + "'s foods are ready.");
    }
}
