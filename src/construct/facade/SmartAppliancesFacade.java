/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.facade;

/**
 * Facade class
 * @author all
 * @since 2023/7/20 22:58
 */

public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    /**
     * Control by msg.
     * @param msg msg
     */
    public void say(String msg) {
        if (msg.contains("on")) {
            on();
        } else if (msg.contains("off")) {
            off();
        } else {
            System.out.println("Waiting...");
        }
    }

    /**
     * Open everything.
     */
    private void on()  {
        light.on();
        tv.on();
        airCondition.on();
    }

    /**
     * Close everything.
     */
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
