package create.singleton.demo6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 破坏单例模式：序列化
 *
 * @author all
 * @since 2023/6/19 23:17
 */

public class Test {
    public static void main(String[] args) {
        String filePath = "D:\\code\\java\\demo\\designPattern\\design-patterns\\src\\create.singleton\\demo6\\obj.txt";
        Singleton singleton = Singleton.getInstance();
        // writeObjToFile(create.singleton, filePath);
        Object o = readObjFromFile(filePath);
        Object o1 = readObjFromFile(filePath);
        System.out.println(o == o1);
    }

    public static void writeObjToFile(Object obj, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(obj);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static Object readObjFromFile(String filePath) {
        // 1. 创建对象输入流对象
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))){
            return ois.readObject();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
