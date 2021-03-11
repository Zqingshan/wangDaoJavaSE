package com.zqs.javase.oop3_wangdao.abstract1.introduction1;

/**
 * @description: 引入抽象类的概念
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * Animal类的继承体系，有什么问题？
 *
 * - 从代码角度上，有没有冗余代码？
 * Animal类的shout方法其实是没有调用过的。理想情况下，我希望这个方法，没有方法体。只有方法的声明
 * 用来被子类重写
 * - 从设计角度上，在这个案例中，会存在一个“动物”对象吗？
 * 没有Animal对象，在这个案例中，动物类已经上升到了一个抽象的概念，在我要使用对象的时候，我都会去创建实际动物的对象，而不是Animal--->既然你不用创建对象，而且是个抽象概念，干脆你就别创建对象了
 * 对于Animal这个抽象概念来说，怎么去描述一个抽象事物的行为？ 不太好描述，所以通过这一点，也希望我们把方法变成没有方法体的
 * 总结（需求）：
 * 1，Animal类不能创建对象，是个抽象概念。它仅仅是用来被继承的，不用用来干活，就是用来生孩子的
 * 2，shout() 方法的方法体应该被去掉。这个方法仅仅用来被子类重写的
 *
 * 立刻把方法体干掉，报错
 * Missing method body, or declare abstract
 * 一个方法要么有方法体，要么是声明为抽象的方法
 * 怎么声明抽象方法？
 * 语法：[访问权限修饰符] abstract 方法名(); //分号不要忘记
 *
 * 加完又报错
 * Class 'Animal' must either be declared abstract or implement abstract method 'shout()' in 'Animal'
 * 说明：抽象方法必须在抽象类中，普通类中没有抽象方法
 * 怎么声明抽象类呢？
 * 语法：[访问权限修饰符] abstract class 类名{
 * }
 * 把Animal声明为abstract后，变成了抽象类，程序就不报错了
 * 验证：
 * 1，Animal能不能创建对象
 * 2，整个继承体系和多态调用还正常不？
 *
 */
public class Demo {
    public static void main(String[] args) {
        //1，Animal能不能创建对象
        //'Animal' is abstract; cannot be instantiated instance
        //Animal a = new Animal();

        //2，整个继承体系和多态调用还正常不？
        //抽象类也是类，它也是猫和狗的父类，多态调用仍然生效
        Animal a;
        a = new Dog();
        a.shout(); //狗叫
        a = new Cat();
        a.shout(); //猫叫
    }
}
abstract class Animal {
    public abstract void shout();
}
class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}
class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}