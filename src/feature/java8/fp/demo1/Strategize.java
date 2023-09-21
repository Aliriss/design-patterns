package feature.java8.fp.demo1;

/**
 * @author all
 * @since 2023/9/19 17:30
 */

public class Strategize {
    Strategy strategy;
    String msg;

    Strategize(String msg) {
        // 0. 默认一个策略，直接实现类的实例
        strategy = new Soft();
        this.msg = msg;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                // 1. 匿名内部类
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                // 2. lambda表达式
                msg -> msg.substring(0, 5),
                // 3. 方法引用
                Unrelated::twice
        };

        Strategize s = new Strategize("Hello there");
        s.communicate();

        // 最终实现效果：改变策略，传递行为，而不是数据
        for (Strategy strategy1 : strategies) {
            s.changeStrategy(strategy1);
            s.communicate();
        }
    }

    void communicate() {
        System.out.println(strategy.approach(this.msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
