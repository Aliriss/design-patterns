/*
 * Copyright (c) 2023. ALL.
 */

package behavior.iterator;

/**
 * @author all
 * @since 2023/8/1 8:23
 */

public class Student {
    private String name;
    private String num;

    public Student(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return name + " : " + num;
    }
}
