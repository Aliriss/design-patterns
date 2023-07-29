/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author all
 * @since 2023/7/24 8:27
 */

public class Order {
    /**
     * 餐桌号码
     */
    private int diningTable;
    /**
     * 餐品及份数
     */
    private Map<String, Integer> foods = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoods() {
        return foods;
    }

    public void setFoods(String name,  Integer num) {
        this.foods.put(name, num);
    }
}
