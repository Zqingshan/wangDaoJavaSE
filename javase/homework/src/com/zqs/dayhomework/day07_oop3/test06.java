package com.zqs.dayhomework.day07_oop3;

/**
 * @description: 手写猫狗案例，并进行测试，要求使用继承
 * 猫：姓名，年龄，颜色，可以叫，可以抓老鼠
 * 狗：姓名，年龄，性别，可以叫，可以看门
 * @author: z_qingshan
 * @create: 2021-03-08
 **/
public class test06 {
    public static void main(String[] args) {
        Cat cat = new Cat("小花", 4, "花色");
        System.out.println("猫的信息：名字：" + cat.name + "，年龄：" + cat.age + "，颜色：" + cat.color);

        Dog dog = new Dog();
        dog.name="旺财";
        dog.age=5;
        dog.gender='公';
        System.out.println("狗的信息：名字：" + dog.name + "，年龄：" + dog.age + "，性别：" + dog.gender);
    }
}

class Animal {
    String name;
    int age;

    public void call() {
        System.out.println("我叫了");
    }
}

//猫类继承动物类
class Cat extends Animal {
    //属性
    String color;

    public Cat() {
    }

    //构造方法
    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //行为
    public void catchMice() {
        System.out.println("猫：我会抓老鼠");
    }

}

//狗类继承动物类
class Dog extends Animal {
    //属性
    char gender;

    //行为
    public void gateKeeper() {
        System.out.println("狗：我可以看门");
    }
}