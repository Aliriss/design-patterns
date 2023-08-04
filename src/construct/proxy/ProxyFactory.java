package construct.proxy;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理工厂
 * @author all
 * @since 2023/4/27 14:59
 */

public class ProxyFactory {
    // 只能代理接口方法
    private final TrainStation station = new TrainStation();
    public SellTickets getProxyObject() {
        return (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("invoke method run");
                    return method.invoke(station, args);
                }
        );
    }
}
