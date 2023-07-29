/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

package construct.flyweight;

/**
 * @author all
 * @since 2023/7/22 12:57
 */

public class Client {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        instance.getBox("O").display("red");
        instance.getBox("L").display("green");
        instance.getBox("I").display("yellow");
        instance.getBox("I").display("blue");
        System.out.println("same object I box: " + (instance.getBox("I") == instance.getBox("I")));
    }
}
