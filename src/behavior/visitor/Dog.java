/*
 * Copyright (c) 2023. ALL.
 */

package behavior.visitor;

/**
 * @author heyabo
 * @since 2023/8/5 16:33
 */

public class Dog implements Animal{
    /**
     * 接受投喂
     *
     * @param person person
     */
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("汪~");
    }
}
