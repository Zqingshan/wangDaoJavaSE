package com.zqs.dayhomework.day08_oop4;

/**
 * @description: 自己定义一个类，类中定义3个成员变量，这3个成员变量都被final修饰，
 * 请用3种不同方式，为这3个被final修饰的成员变量赋值。
 * 再定义两个静态成员变量，用final修饰该静态成员，完成赋值。
 * @author: z_qingshan
 * @create: 2021-03-09
 **/
public class test02 {
    public static void main(String[] args) {

    }
}

class Student {
    final String name;
    final int age;
    final String gender = "男"; //第一种方式，直接赋值

    //第二种方式，构造代码块赋值
    {
        name = "Jack";
    }

    //第三种方式，构造方法赋值
    public Student(int age) {
        this.age = age;
    }
}

class Cat {
    static final int AGE;
    static final String name = "Tom"; //第一种方式

    //第二种方式
    static {
        AGE = 10;
    }
}