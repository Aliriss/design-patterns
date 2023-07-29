package create.prototype.demo;

/**
 * @author all
 * @since 2023/7/16 17:55
 */

public class Student {
    private String name;
    private Integer age;
    private String sex;
    public Student() {}
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
