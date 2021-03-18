package com.zqs.dayhomework.day10_interface;

/**
 * @description: 第二题
 * @author: z_qingshan
 * @create: 2021-03-11
 **/

/**
 * 定义一条狗类
 * 狗有：年龄，姓名的属
 * 除此之外，狗还有身体这个成员，身体有：
 * 颜色
 * 要求狗类中提供一个方法，可以显示它的整体信息
 * 并写代码进行测试
 */
public class Test02 {
    public static void main(String[] args) {
        Dog dog = new Dog(3, "Jack");
        dog.getInfo("黑色");
    }
}

class Dog {
    int age;
    String name;

    class DogBody {
        String color;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog() {
    }

    public void getInfo(String color) {
        DogBody dogBody = new DogBody();
        dogBody.color = color;
        System.out.println("颜色：" + color);
        System.out.println("年龄：" + this.age);
        System.out.println("名字：" + this.name);
    }
}