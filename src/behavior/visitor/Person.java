/*
 * Copyright (c) 2023. ALL.
 */

package behavior.visitor;

/**
 * 访问者接口
 *
 * @author heyabo
 * @since 2023/8/5 16:33
 */

public interface Person {
    /**
     * 喂猫
     * @param cat 猫
     */
    void feed(Cat cat);

    /**
     * 喂狗
     * @param dog 狗
     */
    void feed(Dog dog);
}
