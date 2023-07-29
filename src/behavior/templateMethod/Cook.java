/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.templateMethod;

/**
 * @author all
 * @since 2023/7/22 23:05
 */

public abstract class Cook {
    /**
     * 模板方法定义。
     */
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    /**
     * 倒油
     */
    public void pourOil() {
        System.out.println("Pour oil...");
    }

    /**
     * 热油
     */
    public void heatOil() {
        System.out.println("Heat oil...");
    }

    /**
     * 放蔬菜
     */
    public abstract void pourVegetable();

    /**
     * 放调味汁，酱，调料
     */
    public abstract void pourSauce();

    public void fry() {
        System.out.println("Fry...");
    }
}
