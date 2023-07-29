package create.prototype.test;

import create.prototype.demo.Citation;
import create.prototype.demo.Student;

/**
 * @author all
 * @since 2023/7/16 17:36
 */

public class CitationTest {
    public static void main(String[] args) {
        // 1. 创建原型对象
        Citation citation = new Citation();
        citation.setStudent(new Student("HYB"));
        // 2. 克隆
        Citation citation1 = citation.clone();
        // 3.赋不同值进行测试
        // citation1.setStudent(new Student("DWY"));
        citation1.getStudent().setName("DWY");
        // 4. 展示
        citation.show();
        citation1.show();


    }
}
