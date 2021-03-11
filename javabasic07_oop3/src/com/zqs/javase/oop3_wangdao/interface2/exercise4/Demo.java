package com.zqs.javase.oop3_wangdao.interface2.exercise4;

/**
 * @description: 练习1
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 小试牛刀
 * 请用所学知识分析：
 * 这个案例中有哪些抽象类，哪些接口，哪些具体类。
 *
 * - 猫狗案例，加入跳远的额外功能
 * 抽象类: 动物类
 * 接口: 跳远
 * 具体类: 猫和狗
 *
 */
public class Demo {
}
abstract class Animal{
}
interface IJump{

}
class Cat extends Animal implements IJump{
}
class Dog extends Animal implements IJump{
}