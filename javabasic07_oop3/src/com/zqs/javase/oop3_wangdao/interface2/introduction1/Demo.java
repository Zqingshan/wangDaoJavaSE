package com.zqs.javase.oop3_wangdao.interface2.introduction1;

/**
 * @description: 引入接口
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 引例
 * 回想Animal继承体系的案例，现在我们把Animal设计成抽象类
 * 产品经理给了新需求
 *
 * - 现在有一部分猫和狗，经过了特殊训练
 *   - 都可以直立行走（WalkUpright）和骑自行车（RideBike）
 * - 那么该怎么去描述这群特殊的猫狗呢？
 *
 * 1，新建一个SuperCat继承Cat的同时扩展功能
 * 这样写可以实现功能，但是很明显还是有问题的
 *   代码有重复的，有冗余的代码
 *   不方便扩展
 * 于是我把这些方法抽取出来 单独作为一个类，然后这些超级XXX继承这个类
 * 想法是好的，但是Java不支持多继承，这样的想法实现不了
 * 如果这个类不是普通类，而是一个抽象类，那么这个类既可以复用代码，又可以提供规范
 *
 * 现在类class受限于多继承，我们无法做到
 * 于是，我们希望有一种新的数据类型，这种数据类型不受限制于类的多继承，可以在继承一个类的同时，还继承这个新的数据类型
 * 这种新的数据类型就是接口 interface
 * 语法：
 *  [访问权限修饰符] interface 接口名{
 *
 *  }
 *  接口是和class同级别的数据类型
 *  接口的一个命名规范：
 *      很多人喜欢把接口前面加一个I
 *      ITest/IA
 *  Interface abstract methods cannot have body
 *  接口的方法特点：接口中的所有方法都是抽象方法（Java8之前）之后，有实现方法
 *
 *  接口定义完毕后，需要去继承接口，怎么去继承一个接口呢？
 *  接口的继承有一个单独的关键字 implements 实现
 *  严格来说 继承一个接口 叫实现接口
 *
 *  一个类如果又继承又实现，应该先继承类 再实现接口
 *
 *  使用接口有什么优点，为什么非用不可？
 *  1，继承的定义上讲，继承不能多继承
 *  继承中两个类应该是什么关系？ is-a关系
 *  本案例中 特殊行为和动物本身没有这种关系
 *  接口中两个类的关系 like-a关系
 *  like-a表示一种功能的组合，类比于生活中的接口
 *  接口表示对功能的扩展
 *
 *  2，抽象方法起到占位置的作用，但是抽象类中的抽象方法受多继承限制，接口不受
 *
 *
 *  调用一下，这些方法。
 *  接口也是其实现类的父类，也可以发生多态现象
 *
 *  思考：
 *  接口能不能创建对象？
 *  接口不是实例化
 *
 *  一个类可不可以实现多个接口？
 *  是允许的，一个类是可以实现多个接口的
 *
 *  一个类实现空接口有没有什么作用？
 *  实现一个接口就变成其子类了
 *
 */
public class Demo {
    public static void main(String[] args) {
        //现在SuperCat两个父类了，那么分别用这两个父类多态调用 有什么区别？
        //编译看左边，只能调用父类中的方法
        //Animal a;
        //a = new SuperCat();
        ////a.
        //ISpecialSkill iss;
        //iss = new SuperCat();
        ////((SuperCat) iss).shout();
        new SuperDog();

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
class SuperCat extends Cat implements ISpecialSkill{
    //超级猫
    @Override
    public void walkUpright() {
        //具体细节
        System.out.println("威威猫能直立行走");
    }
    @Override
    public void rideBike() {
        //具体细节
        System.out.println("威威猫能开自行车");
    }
}

class SuperDog extends Dog implements ISpecialSkill,ITest{ //超级狗


    public SuperDog() {
        super();
    }

    //直立行走 狮子狗
    @Override
    public void walkUpright(){
        System.out.println("狗直立行走");
    }
    //骑自行车
    @Override
    public void rideBike(){
        System.out.println("狗骑自行车");
    }
}

interface ISpecialSkill{
    //直立行走
    public void walkUpright();
    //骑自行车
    public void rideBike();
}
interface ITest{
}