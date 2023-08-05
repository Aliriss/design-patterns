/*
 * Copyright (c) 2023. ALL.
 */

package behavior.visitor;

/**
 * 抽象元素角色类
 * @author heyabo
 * @since 2023/8/5 16:33
 */

public interface Animal {
    /**
     * 接受投喂
     * @param person person
     */
    void accept(Person person);
}
