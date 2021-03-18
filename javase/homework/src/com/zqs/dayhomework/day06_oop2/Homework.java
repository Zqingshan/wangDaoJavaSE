package com.zqs.dayhomework.day06_oop2;


/**
 * 
 * 问题1: 思考注释一能否放开?会不会报错?这样书写格式好不好?怎么写可读性最好?
 * 能放开，不会报错，不太好，System.out.println(Homework.s.age); //这种方式更好
 * 问题2: 思考控制台输出的顺序,并用文字描述它,需要说明原因
 * 问题3: Homework building和Homework constructor会不会输出,为什么?
 */
public class Homework {
    //2、类加载会初始化静态成员 同等于static int a = 3;
    //这里新建了一个Student对象，于是去找它的构造方法
    static Student s = new Student();

    //构造代码块（非静态代码块）
    {
        System.out.println("Homework building");
        s = null;
    }

    //1、找到这个类的main方法，启动main方法会触发Homework类加载
    public static void main(String[] args) {
        //7、类加载结束，继续执行main方法
        System.out.println("main");
        //8、age=20
        //System.out.println(s.age); //注释一
        System.out.println(Homework.s.age); //这种方式更好
        //9、新建了一个Person对象
        Person p = new Person("刘备");
        //12、p.name=刘备
        System.out.println(p.name);
    }

    //无参构造器
    public Homework() {
        System.out.println("Homework constructor");
    }
}

class Person {
    //构造代码块（非静态代码块）
    {
        name = "赵云";
        System.out.println("Person building");
    }

    String name = "曹操";

    //11、先初始化静态成员
    static Student s = new Student();

    //无参构造器
    public Person() {
    }

    //10、找到Person的name参数构造器，先进行类加载
    //有参构造器
    public Person(String name) {
        System.out.println("Person constructor");
        this.name = name;
    }
}

class Student {
    //4、按照从上到下的顺序执行，显示赋值和构造代码块
    int age = 10;
    //构造代码块（非静态代码块）
    {
        //5、第一个打印出来是它
        System.out.println("Student building");
        age = 20;
    }

    //有参构造器
    public Student(int age) {
        this.age = age;
    }

    //3、找到它的构造方法，这个类会进行类加载，这个类没有静态成员
    //无参构造器
    public Student() {
        //6、第二个打印它
        System.out.println("Student constructor");
    }
}