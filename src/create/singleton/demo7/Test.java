package create.singleton.demo7;

import java.lang.reflect.Constructor;

/**
 * 破坏单例模式：反射
 *
 * @author all
 * @since 2023/6/19 23:17
 */

public class Test {
    public static void main(String[] args) {
        String filePath = "D:\\code\\java\\demo\\designPattern\\design-patterns\\src\\create.singleton\\demo7\\obj.txt";
        Singleton singleton = Singleton.getInstance();
        try{
            // 1. 获取字节码对象
            Class<Singleton> singletonClass = Singleton.class;
            // 2. 获取无参构造器
            Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
            // 3. 设置可访问权限
            declaredConstructor.setAccessible(true);
            // 4. 创建对象
            Singleton singleton1 = declaredConstructor.newInstance();
            Singleton singleton2 = declaredConstructor.newInstance();
            System.out.println(singleton1 == singleton2);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
