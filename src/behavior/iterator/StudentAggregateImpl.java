/*
 * Copyright (c) 2023. ALL.
 */

package behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author all
 * @since 2023/8/1 8:31
 */

public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> studentList = new ArrayList<>();

    /**
     * 添加学生
     *
     * @param student student
     */
    @Override
    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    /**
     * 删除学生
     *
     * @param student student
     */
    @Override
    public void removeStudent(Student student) {
        this.studentList.remove(student);
    }

    /**
     * 获取迭代器
     *
     * @return StudentIterator
     */
    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(this.studentList);
    }
}
