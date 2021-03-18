package com.zqs.dayhomework.day10_interface;

/**
 * @description: 第四题
 * @author: z_qingshan
 * @create: 2021-03-11
 **/

/**
 * 学校里有学生，请定义一个学校类，思考怎么设计学生类
 * 学生类有age，name等属性
 * 要求在学校类中提供方法，打印学生信息
 * 并写代码测试
 */
public class Test04 {
    public static void main(String[] args) {
        School school = new School();
        school.getInfo(19, "Jack");
    }
}

class School {
    class Student {
        int age;
        String name;
    }

    public void getInfo(int age, String name) {
        Student stu = new Student();
        stu.age = age;
        stu.name = name;
        System.out.println("姓名为：" + name + "的学生年龄为：" + age + "岁");
    }
}