/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.strategy;

/**
 * @author all
 * @since 2023/7/23 19:17
 */

public class StrategyA implements Strategy {
    /**
     * 展示
     */
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
