/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.strategy;

/**
 * @author all
 * @since 2023/7/23 19:18
 */

public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 展示
     */
    public void show() {
        strategy.show();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
