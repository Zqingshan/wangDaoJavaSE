package com.zqs.javase.oop3.abstract1.basic2;

/**
 * @description: 抽象类的成员特点和抽象类的子类特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 抽象类的成员
 *   - 成员变量
 *   和普通类没有区别，完全一样。普通类能够定义的成员变量，抽象类都能定义
 *
 *   - 成员方法
 *   1，可以定义普通的成员方法，可以定义实现方法
 *   极端的程序员：抽象类已经是一个抽象的概念了，它就不应该有实现方法
 *   这种说法没有道路，程序员是为了实现需求的
 *   假设我现在有一个需求：
 *   有一个方法是抽象类的所有子类都可能共用的一个方法
 *   仍然需要去写一个实现方法
 *   所以一般来说，抽象类中定义普通方法是用来作为子类的默认实现的，子类可以选择直接继承该方法，然后直接使用，子类也可以选择重写该方法。现在选择权在子类手里
 *   2，可以定义静态成员方法，一般如果子类有继承父类静态成员方法的需求，可以这么做。但是这种需求很少，一般来说没人在抽象类中定义静态方法
 *
 *   3，抽象类中允许没有抽象方法吗？
 *   允许的
 *   有些程序员会把一个正常类，直接定义为抽象类
 *   实现不让这个类创建对象的需求
 *   但是这种方式显然不合适
 *   抽象是一个概念，是为了抽象出继承体系中的祖先类
 *   如果真的有这种需求，直接私有化构造方法即可
 *   抽象类如果没有抽象方法，一般来说没有什么意义。
 *   抽象类应该有抽象方法
 *
 *   4，抽象类中定义抽象方法
 *   抽象类中的抽象方法起到占位的作用，一旦父类中声明抽象方法，子类要么是一个抽象类，要么必须实现该方法
 *   抽象方法可以是私有的、final的、静态的吗？
 *   统统都不能
 *
 *   - 构造方法
 *   抽象类不能创建对象，那么它有没有构造器？
 *   有构造器，它是给子类对象初始化用的，不是给自己用的
 *
 *   立刻说一句话：
 *   Java中所有的类都有构造方法，不存在一个类没有构造方法
 *   普通类+抽象类
 *   如果一个类不写任何构造方法，提供默认的构造方法
 *   如果写了，不提供默认的
 *
 * - 抽象类的子类
 * - 抽象类的子类可以是抽象类，也可以是具体类
 * - 只有当子类重写了，所有的继承自抽象类的方法，该子类才能被定义为具体类
 * - 反之，若任一抽象方法没有被重写，该类都必须定义为抽象类
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //Person.testStatic();
        Student s = new Student(888);
        System.out.println(s.a);

    }
}

abstract class Person {
    {
        a = 777;
    }
    //定义成员变量
    int a = 666;

    int b = 10;
    static int c = 20;
    static final int D = 30;

    //构造方法

    public Person() {
    }

    public Person(int a) {
        this.a = a;
    }

    //定义成员方法
    public void testMember(){
        System.out.println("testMember");
    }

    public static void testStatic(){
        System.out.println("testStatic");
    }

    public abstract void testAbstract();
    public abstract void testAbstract2();
    //Illegal combination of modifiers: 'abstract' and 'private' 非法的修饰符组合
    //抽象方法是为了给子类重写的，所以说它要鼓励子类去重写，所以抽象方法普遍来说都是public修饰
    //private abstract void testAbstract2();
    //Illegal combination of modifiers: 'abstract' and 'final'
    //final abstract void testAbstract2();
    //父子类中同名静态成员方法，不是方法重写，而是完全独立的两个方法，没有任何关系
}

//Class 'Student' must either be declared abstract or implement abstract method 'testAbstract()' in 'Person'
class Student extends Person {
    //实现方法其实就是重写这个方法 Alt+回车
    @Override
    public void testAbstract() {
        System.out.println("Student");
    }

    @Override
    public void testAbstract2() {

    }

    //Student是抽象类的子类，继承了抽象类的成员
    //如果抽象类中没有构造器，那么子类就无法去给父类的成员赋值了


    public Student() {
        //隐含super()
    }

    public Student(int a) {
        super(a); //调用父类有参构造
    }
}

abstract class Teacher extends Person {
 //抽象子类可以允许有抽象方法，而不重写

    @Override
    public void testAbstract() {

    }
}