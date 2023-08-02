/*
 * Copyright (c) 2023. ALL.
 */

package behavior.iterator;

/**
 * 抽象迭代器角色接口
 * @author all
 * @since 2023/8/1 8:24
 */

public interface StudentIterator {
    /**
     * 是否有下一个元素
     * @return Boolean
     */
    Boolean hasNext();

    /**
     * 返回下一个元素
     * @return Student
     */
    Student next();
}
