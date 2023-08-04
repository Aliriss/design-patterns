/*
 * Copyright (c) 2023. ALL.
 */

package behavior.mediator;

/**
 * 抽象同事类
 * @author all
 * @since 2023/7/30 3:05
 */

public abstract class Person {
    protected String name;
    protected Mediator mediator;

    protected Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    protected Person() {
        this("未知", null);
    }

    /**
     * 沟通
     * @param msg msg
     */
    protected abstract void contact(String msg);

    /**
     * 获取信息
     * @param msg msg
     */
    protected abstract void getMsg(String msg);
}
