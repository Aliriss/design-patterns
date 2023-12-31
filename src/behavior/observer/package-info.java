/**
 * 观察者模式：
 * <p>又被称为发布订阅模式，定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，这个主题对象在状态变化时，会通知所有的观察者对象，使他们能够自动更新自己。</p>
 * 结构：<ol>
 *     <li>Subject；抽象主题（抽象被观察者），抽象主题角色把所有观察者对象保存在一个集合里，每个主题都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象</li>
 *     <li>Concrete Subject：具体主题（被观察者），该角色将有关状态存入具体观察者对象，在具体主题的内部状态发生改变时，给所有注册过的观察者发送通知</li>
 *     <li>Observer：抽象观察者，定义了一个更新接口，使得在主题更改通知时更新自己</li>
 *     <li>Concrete Observer：观察者，实现抽象观察者定义的更新接口，使得主题更改通知时更新自己</li>
 * </ol>
 *
 * @author all
 * @since 2023/7/29 14:10
 */
package behavior.observer;
