package create.prototype.demo;

/**
 * @author all
 * @since 2023/7/16 2:27
 */

public class Citation implements Cloneable {
    private String name;
    private Student student;

    public void show() {
        System.out.println(this.student.getName() + " citation.");
    }

    @Override
    public Citation clone() {
        try {
            return (Citation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
