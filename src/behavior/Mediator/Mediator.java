/*
 * Copyright (c) 2023. ALL.
 */

package behavior.Mediator;

/**
 * 中介者类
 * @author all
 * @since 2023/7/30 3:05
 */

public abstract class Mediator {

    /**
     * 沟通
     * @param msg 信息
     * @param person 人
     */
    public abstract void contact(String msg, Person person);
}
