package com.zqs.dayhomework.day09_abstract;

/**
 * @description: 练习题2
 * @author: z_qingshan
 * @create: 2021-03-10
 **/

/**
 * 现在动物园来了一批动物
 * 共同的：
 * 属性：种类，名字，年龄
 * 行为：表演
 * 请设计这个体系，自定义几个具体动物类
 */
public class Test2 {
    public static void main(String[] args) {
        Animal a;
        //输出老虎的信息和表演行为
        a = new Tiger("老虎","泰哥",3);
        a.printInfo();
        a.Performance();

        //输出海豚的信息和表演行为
        a=new Dolphin("海豚","叮当",2);
        a.printInfo();
        a.Performance();
    }
}

//动物抽象类
abstract class Animal {
    String species; //种类
    String name; // 名字
    int age;

    public abstract void Performance();

    public Animal() {
    }

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    //输出动物的信息
    public void printInfo(){
        System.out.println("种类：" + this.species + "，名字：" + this.name + "，年龄：" + this.age);
    }
}

class Tiger extends Animal {
    @Override
    public void Performance() {
        System.out.println("老虎：表演跳火圈~");
    }

    //构造方法
    public Tiger() {
    }

    public Tiger(String species, String name, int age) {
        super(species, name, age);
    }
}

class Dolphin extends Animal {
    @Override
    public void Performance() {
        System.out.println("海豚：表演套圈");
    }

    //构造方法
    public Dolphin() {
    }

    public Dolphin(String species, String name, int age) {
        super(species, name, age);
    }
}