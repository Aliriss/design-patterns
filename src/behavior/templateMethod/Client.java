/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package behavior.templateMethod;

/**
 * @author all
 * @since 2023/7/22 23:44
 */

public class Client {
    public static void main(String[] args) {
        Cook cook = new FiredCabbage();
        cook.cookProcess();
        new FiredShreddedPotatoes().cookProcess();
    }
}
