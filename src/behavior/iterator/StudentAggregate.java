/*
 * Copyright (c) 2023. ALL.
 */

package behavior.iterator;

/**
 * 抽象聚合角色接口
 * @author all
 * @since 2023/8/1 8:29
 */

public interface StudentAggregate {
    /**
     * 添加学生
     * @param student student
     */
    void addStudent(Student student);

    /**
     * 删除学生
     * @param student student
     */
    void removeStudent(Student student);

    /**
     * 获取迭代器
     * @return StudentIterator
     */
    StudentIterator getStudentIterator();
}
