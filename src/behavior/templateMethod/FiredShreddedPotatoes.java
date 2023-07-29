/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.templateMethod;

/**
 * @author all
 * @since 2023/7/22 23:42
 */

public class FiredShreddedPotatoes extends Cook{
    /**
     * 放蔬菜
     */
    @Override
    public void pourVegetable() {
        System.out.println("Pour shredded potatoes...");
    }

    /**
     * 放调味汁，酱，调料
     */
    @Override
    public void pourSauce() {
        // 辣椒
        System.out.println("Pour pepper...");
        // 盐
        System.out.println("Pour salt...");
    }
}
