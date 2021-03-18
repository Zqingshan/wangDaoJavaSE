package com.zqs.dayhomework.day05_oop1;

/**
 * @description: 定义一个人类（Person），该类中应该有两个私有属性，姓名（name）和年龄（age）。
 * 定义构造方法，用来初始化数据成员。再定义显示（display）方法，将姓名和年龄打印出来。
 * 在main方法中创建人类的实例，然后将信息显示。
 * @author: z_qingshan
 * @create: 2021-03-05
 **/
public class test04 {
    public static void main(String[] args) {
        Person person = new Person("Jack", 20);
        person.display();
    }
}

class Person {
    //属性
    private String name;
    private int age;

    //构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //display()方法
    public void display() {
        System.out.println("姓名：" + this.name + "，年龄：" + this.age);
    }
}
