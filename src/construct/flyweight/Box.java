/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.flyweight;

/**
 * @author all
 * @since 2023/7/21 23:02
 */

public abstract class Box {
    public abstract String getShape();
    public void display(String color) {
        System.out.println(getShape() + " box is " + color + ".");
    }
}
