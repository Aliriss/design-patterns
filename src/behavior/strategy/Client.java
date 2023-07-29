/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.strategy;

/**
 * @author all
 * @since 2023/7/23 21:56
 */

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.show();
        salesMan.setStrategy(new StrategyB());
        salesMan.show();
    }
}
