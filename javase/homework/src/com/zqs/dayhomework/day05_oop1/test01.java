package com.zqs.dayhomework.day05_oop1;

/**
 * @description: 1.定义一个Student类：
 * a. 要求包含4个成员变量 String name, int age, boolean gender, int sno
 * b. 分别定义5个构造方法
 * 分别为无参构造
 * 初始化name成员变量值的1参构造方法
 * 初始化name 和 sno两个成员变量值的2参构造方法
 * 初始化name，age，isMale三个成员变量值的3参构造方法
 * 初始化name，age， isMale，sno这4个成员变量值的4参构造方法
 * c. 再定义一个成员方法print()，打印这个学生类对象信息
 * @author: z_qingshan
 * @create: 2021-03-05
 **/
public class test01 {
    public static void main(String[] args) {
        Student stu = new Student("Jack",23,true,202001);
        stu.print();

        Student stu1 = new Student("张三",18,true,1);
        stu1.print();

        Student stu2 = new Student("李四",25,false,2);
        stu2.print();
    }
}

class Student {
    String name;
    int age;
    boolean gender;
    int sno;

    //无参构造方法
    public Student() {
    }

    //初始化name成员变量值的1参构造方法
    public Student(String name) {
        this.name = name;
    }

    //初始化name 和 sno两个成员变量值的2参构造方法
    public Student(String name, int sno) {
        this.name = name;
        this.sno = sno;
    }

    //初始化name，age，isMale三个成员变量值的3参构造方法
    public Student(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //初始化name，age， isMale，sno这4个成员变量值的4参构造方法
    public Student(String name, int age, boolean gender, int sno) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sno = sno;
    }

    //print()
    public void print() {
        System.out.println("姓名=" + this.name + "，年龄=" + this.age + "，性别=" + this.gender + "，学号=" + this.sno);
    }
}