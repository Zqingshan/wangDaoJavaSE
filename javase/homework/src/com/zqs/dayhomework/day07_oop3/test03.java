package com.zqs.dayhomework.day07_oop3;

/**
 * @description: 定义一个Student类，并要求其他类在使用Student类的时候，
 * 最多只能创建10个Student类的对象，如何实现？
 * 提示：首先，要实现该功能，就不能让外部类直接使用 * new Student(...)的方式来创建对象，
 * 如何不能让其他类new Student(...)方式创建对象？
 * 接着，把创建对Student对象的工作，交给一个专门的方法去做(现在这个类的外部已经无法创建对象了，想想这个方法应该在哪里
 * @author: z_qingshan
 * @create: 2021-03-08
 **/
public class test03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            Student.createNewStu();
        }
    }
}

class Student {
    //私有化构造方法，其他类就不能直接new对象了
    private Student() {
    }

    static int count = 1;

    public static Student createNewStu() {
        if (count <= 10) {
            System.out.println("第" + count + "个对象：" + "Student stu" + count + " = new Student();");
            Student stu = new Student();
            count++;
            return stu;
        } else {
            System.out.println("创建对象失败，最多能创建10个对象");
            return null;
        }
    }
}