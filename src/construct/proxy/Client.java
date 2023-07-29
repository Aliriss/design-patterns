package construct.proxy;

/**
 * @author all
 * @since 2023/4/27 15:08
 */

public class Client {
    public static void main(String[] args) {
        // 简单代理对象测试
        // simpleProxyTest();
        // JDK动态代理测试
        // jdkDynamicProxyTest();
        // CGLIB代理测试
        cglibProxyTest();
    }

    /**
     * 简单代理对象测试
     */
    public static void simpleProxyTest() {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }

    /**
     * JDK动态代理测试：必须定义接口
     */
    public static void jdkDynamicProxyTest() {
        // 1. 创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        // 2. 获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }

    /**
     * CGLIB代理：适用于没有接口
     */
    public static void cglibProxyTest() {
        ProxyFactoryV1 proxyFactory = new ProxyFactoryV1();
        TrainStationV1 proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
