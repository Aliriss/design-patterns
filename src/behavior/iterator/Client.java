/*
 * Copyright (c) 2023. ALL.
 */

package behavior.iterator;

/**
 * @author all
 * @since 2023/8/1 8:34
 */

public class Client {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("1", "1232"));
        studentAggregate.addStudent(new Student("2", "1233"));
        studentAggregate.addStudent(new Student("3", "1233"));
        studentAggregate.addStudent(new Student("4", "1234"));

        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while(studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
    }
}
