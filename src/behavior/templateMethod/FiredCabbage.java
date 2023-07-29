/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.templateMethod;

/**
 * @author all
 * @since 2023/7/22 23:10
 */

public class FiredCabbage extends Cook{
    /**
     * 放蔬菜
     */
    @Override
    public void pourVegetable() {
        System.out.println("Pour cabbage...");
    }

    /**
     * 放调味汁，酱，调料
     */
    @Override
    public void pourSauce() {
        // 盐
        System.out.println("Pour salt...");
        // 蒜蓉
        System.out.println("Pour garlic...");
        // 辣椒
        System.out.println("Pour pepper...");
    }
}
