
/**
 * 组合模式<br/>
 * 优点:<ol>
 *     <li>可以清楚的定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制</li>
 *     <li>客户端可以一致的使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码</li>
 *     <li>在组合模式中添加新的树枝节点合叶子节点都非常方便，无需对现有类库进行修改，符合开闭原则</li>
 *     <li>组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子节点合树节点的递归组合，可以形成复杂的属性结构，但对树形结构的控制却非常简单</li>
 * </ol>
 * 使用场景：<br/>
 * 应树形结构产生。适用于属性结构出现的场景，如文件目录显示，多级目录呈现等树形结构数据的操作。
 * @author all
 * @since 2023/7/21 10:29
 */
package construct.combination;
