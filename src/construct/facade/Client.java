/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.facade;

/**
 * @author all
 * @since 2023/7/20 23:03
 */

public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("on");
        facade.say("wait");
        facade.say("off");
    }
}
