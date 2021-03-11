package com.zqs.javase.oop3_wangdao.interface2.notice3;

/**
 * @description: 接口注意事项
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 定义Java类的语法格式：先写extends，后写implements
 *   -     class SubClass extends SuperClass implements InterfaceA{
 *         }
 * - 一个类可以实现多个接口，接口也可以继承其它接口，这就是Java当中的“多继承”
 * - 实现接口的类中必须提供接口中所有方法的具体实现内容，方可实例化。否则，仍为抽象类
 * - 接口的主要用途就是被实现类实现
 *   - 所以接口和接口的成员默认都是public修饰，鼓励继承，鼓励重写
 * - 与继承关系类似，接口与实现类之间存在多态性
 *      编译看左边的: 接口 变量名 = new 接口实现类()
 * - 接口和类是并列的数据类型
 *
 */
public class Demo {
}
