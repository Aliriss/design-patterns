/*
 * Copyright (c) 2023. ALL.
 */

package behavior.iterator;

import java.util.List;

/**
 * @author all
 * @since 2023/8/1 8:25
 */

public class StudentIteratorImpl implements StudentIterator{
    private List<Student> studentList;
    private int index = -1;

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * 是否有下一个元素
     *
     * @return Boolean
     */
    @Override
    public Boolean hasNext() {
        return this.studentList != null && this.studentList.size() > (this.index + 1);
    }

    /**
     * 返回下一个元素
     *
     * @return Student
     */
    @Override
    public Student next() {
        return this.studentList.get(++this.index);
    }
}
