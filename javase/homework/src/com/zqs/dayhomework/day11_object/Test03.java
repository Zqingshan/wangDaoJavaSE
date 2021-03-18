package com.zqs.dayhomework.day11_object;

/**
 * @description:第三题
 * @author: z_qingshan
 * @create: 2021-03-12
 **/

import java.util.Objects;

/**
 * 定义一个类
 * Cat：
 * 成员变量：age，name，Dog
 * Dog：
 * 成员变量：age
 * 手写Cat类的toString()和equals()方法
 */
public class Test03 {
    public static void main(String[] args) {
        Cat cat = new Cat(2, "Tom", new Dog(3));
        Cat cat2 = new Cat(2, "Tom", new Dog(3));

        System.out.println("cat：" + cat.toString());
        System.out.println("cat2：" + cat2.toString());
        System.out.println(cat.equals(cat2));
    }
}

class Cat {
    int age;
    String name;
    Dog dog;

    public Cat() {
    }

    public Cat(int age, String name, Dog dog) {
        this.age = age;
        this.name = name;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(dog, cat.dog);
    }


}

class Dog {
    int age;

    public Dog() {
    }

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }
}