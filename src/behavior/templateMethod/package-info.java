/******************************************************************************
 * Copyright (c) 2023. ALL.                                                   *
 ******************************************************************************/

/**
 * 模板方法模式：<br />
 * 优点：<ol>
 *     <li>提高代码复用性：将相同的代码放在抽象的父类中，将不同的代码放入不同的子类中</li>
 *     <li>实现了反向控制：通过一个父类调用其子类的操作，通过对子类的具体实现扩展不同的行为，实现了反向控制，并符合开闭原则</li>
 * </ol>
 * 缺点：<ol>
 *     <li>对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象</li>
 *     <li>父类中的抽象方法由子类实现，子类执行的结果会影响父类的结果，这导致一种反向的控制结构，这提高了代码阅读的难度</li>
 * </ol>
 * 使用场景：<ol>
 *     <li>算法的整体步骤很确定，但其中个别部分易变时，可以使用模板方法模式，将容易变的部分抽象出来，供子类实现</li>
 *     <li>需要通过子类来决定父类算法中某个步骤是否执行，实现子类对父类的反向控制</li>
 * </ol>
 */
package behavior.templateMethod;
