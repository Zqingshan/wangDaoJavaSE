package com.zqs.javase.oop3_wangdao.abstract1.notice3;

/**
 * @description: abstract注意事项
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * abstract关键字使用上的注意点（notice）
 *
 * - 不能用来修饰构造器、属性、代码块等结构 只需要记住abstract只能修饰class和方法
 * - 不能用来修饰final类 抽象类就是用来被继承的，用final修饰毫无意义
 *   - 无法被继承的类
 * - 不能用来修饰私有方法、静态方法 、final方法
 *   - 无法被重写的方法
 * - 一个抽象类中可以没有抽象方法，但是意义不是很大
 * 抽象方法起到占位置的作用
 *
 */
public class Demo {
}

//Illegal combination of modifiers: 'abstract' and 'final'
abstract class Test {

}