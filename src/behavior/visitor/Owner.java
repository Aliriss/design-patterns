/*
 * Copyright (c) 2023. ALL.
 */

package behavior.visitor;

/**
 * @author heyabo
 * @since 2023/8/5 16:34
 */

public class Owner implements Person{
    /**
     * 喂猫
     *
     * @param cat 猫
     */
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂猫");
    }

    /**
     * 喂狗
     *
     * @param dog 狗
     */
    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂狗");
    }
}
