/*
 * Copyright (c) 2023. ALL.
 */

package behavior.Mediator;

/**
 * @author all
 * @since 2023/7/30 3:14
 */

public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    protected void contact(String msg) {
        mediator.contact(msg, this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println("HouseOwner " + name + " get msg: " + msg);
    }
}
