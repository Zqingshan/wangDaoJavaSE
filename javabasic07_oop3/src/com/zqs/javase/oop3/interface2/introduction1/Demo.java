package com.zqs.javase.oop3.interface2.introduction1;

/**
 * @description: 接口的引入
 * @author: z_qingshan
 * @create: 2021-03-10
 **/

/**
 * > 引例
 * > 回想Animal继承体系的案例，现在我们把Animal设计成抽象类
 * > 产品经理给了新需求
 * <p>
 * - 现在有一部分猫和狗，经过了特殊训练
 * - 都可以直立行走（WalkUpright）和骑自行车（RideBike）
 * - 那么该怎么去描述这群特殊的猫狗呢？
 * <p>
 * 方案一，再定义一个SpecialCat、SpecialDog类让它们继承Cat、Dog、然后扩展骑自行车，直立行走的方法
 * 这个方案可以实现功能，但是有一些小问题。
 * <p>
 * > 显然，如果直接将这些特殊的行为加入到猫、狗的类定义中是不合适的
 * > 因为，不是所有的猫、狗都会这些特殊技能
 * > 可以考虑重新定义特殊的猫狗类（SpecialCat）然后将这些特殊的行为加入到新定义的类中
 * > 这么做不是不行，但是没有对代码进行复用，如果又有一批特殊训练的猴子、狮子等动物呢？
 * > 可能你会想到定义一个装着特殊行为的类，然后让SpecialCat继承它
 * 但是很可惜，Java不支持多继承
 * 但是只要思想不滑坡，办法总比困难多
 * - 为了复用这些“特殊行为”，我们迫切需要一种新的数据格式
 * - 和类相似，可以抽取出共性，定义成员
 * - 不受Java多继承限制
 * - 这种新的数据格式就是接口
 * <p>
 * 接口的语法：
 * [访问权限修饰符] interface 接口名{
 * }
 * 接口不是类，它和类是一个平等的数据关系
 * 一个类继承接口，称之为实现接口
 * 使用implements关键字
 * 一个类实现了接口，也可以称之为接口的子类
 * 接口中不能有普通方法实现
 * <p>
 * 接口更重要的是，一个设计思想
 * 继承中的思想是is-a代表子类是一个父类
 * 但是接口的思想是扩展功能，
 * 接口和实现接口的子类不是is-a的关系
 * 他们是“可以做XXX”的关系
 * <p>
 * 类比生活中的接口，TYPE-C
 * 我的笔记本实现了TYPE-C接口，就是我能够通过这个接口充电或者传输数据
 * USB-A接口
 * 只要是可以用USB-A连接到笔记本上的设备，这个设备实现了这个接口，笔记本就能够扩展功能
 * <p>
 * <p>
 * <p>
 * <p>
 * 接口的概念：
 * ​	一方面，我们有时需要从多个类中派生出一个类，继承它们所有的成员，Java语法不适用
 * ​	另一方面，我们有时候需要从几个类中抽取出共同的行为特征，而它们之间并没有“is-a”关系，继承思想显得不适用，
 * 于是我们引入接口这种数据类型
 * <p>
 * 类不能多继承，但是接口可以多实现
 */
public class Demo {
    public static void main(String[] args) {
        Animal a = new SpecialCat();
        //编译看左边，只能调用父类中的方法
        ((SpecialCat) a).RideBike();
        //父类引用指向子类对象
        ISpecialSkill iss = new SpecialCat();
        iss.WalkUpright();
        iss = new SpecialDog();
        iss.WalkUpright();

        //接口能不能创建对象？
        //接口不能创建对象
        //'ISpecialSkill' is abstract; cannot be instantiated
        //ISpecialSkill i = new ISpecialSkill();

        //接口默认是abstract的，不需要再写了
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

class SpecialCat extends Cat implements ISpecialSkill, I {
    //继承了Cat的属性和方法
    //扩展
    @Override
    public void WalkUpright() {
        System.out.println("我是超威蓝猫,我可以直立行走了");
    }

    @Override
    public void RideBike() {
        System.out.println("我可以骑自行车了");
    }
}

class SpecialDog extends Dog implements ISpecialSkill, I {
    @Override
    public void WalkUpright() {
        System.out.println("我是哮天犬，我可以直立行走了");
    }

    @Override
    public void RideBike() {
        System.out.println("我可以骑自行车了");
    }
    //Class 'SpecialDog' must either be declared abstract or implement abstract method 'WalkUpright()' in 'ISpecialSkill'
    //继承了Dog的属性和方法
    //扩展
    /*public void WalkUpright(){
        System.out.println("我可以直立行走了");
    }
    public void RideBike(){
        System.out.println("我可以骑自行车了");
    }*/
}

class SpecialSkill {
    public void WalkUpright() {
        System.out.println("我可以直立行走了");
    }

    public void RideBike() {
        System.out.println("我可以骑自行车了");
    }
}

interface ISpecialSkill {
    //接口中不能有普通方法实现
    public void WalkUpright();

    public void RideBike();
}

interface I {
}