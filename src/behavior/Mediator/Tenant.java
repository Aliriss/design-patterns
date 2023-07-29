/*
 * Copyright (c) 2023. ALL.
 */

package behavior.Mediator;


/**
 * @author all
 * @since 2023/7/30 3:12
 */

public class Tenant extends Person{

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    protected void contact(String msg) {
        mediator.contact(msg, this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println("Tenant " + name + " get msg: " + msg);
    }
}
