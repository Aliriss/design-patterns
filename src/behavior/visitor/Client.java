/*
 * Copyright (c) 2023. ALL.
 */

package behavior.visitor;

/**
 * @author heyabo
 * @since 2023/8/5 16:34
 */

public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Dog());
        home.addAnimal(new Cat());
        Owner owner = new Owner();
        ZhangSan zhangSan = new ZhangSan();

        home.action(owner);
        home.action(zhangSan);
    }
}
