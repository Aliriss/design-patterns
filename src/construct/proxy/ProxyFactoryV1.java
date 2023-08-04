package construct.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * CGLIB代理工厂
 * @author all
 * @since 2023/7/19 10:06
 */

public class ProxyFactoryV1 implements MethodInterceptor {
    // 被代理类不允许实现接口
    private TrainStationV1 trainStationV1 = new TrainStationV1();
    public TrainStationV1 getProxyObject() {
        // 创建Enhancer对象，类似JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStationV1.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStationV1) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws InvocationTargetException, IllegalAccessException {
        System.out.println("in proxy factory v1...");
        return method.invoke(trainStationV1, objects);
    }
}
