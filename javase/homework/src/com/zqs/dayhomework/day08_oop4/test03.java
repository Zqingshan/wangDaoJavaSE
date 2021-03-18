package com.zqs.dayhomework.day08_oop4;

/**
 * @description: 实现如下多态案例，分别定义Person类，SouthPerson(表示南方人)，NorthPerson(表示北方人)
 * Person
 * eat()
 * SouthPerson
 * eat()
 * NorthPerson
 * eat()
 * 写代码实现，eat方法的多态效果
 * 1:人要吃饭
 * 2:南方人吃炒菜和米饭
 * 3:北方人吃烩菜和馒头
 * 再写一个测试方法，要求该方法可以传入南方人对象和北方人对象，调用eat()方法，产生不同的行为
 * @author: z_qingshan
 * @create: 2021-03-09
 **/
public class test03 {
    public static void main(String[] args) {
        System.out.println("=====多态效果=====");
        Person p = new Person();
        p.eat();

        //父类引用指向不同的子类对象
        p = new SouthPerson();
        p.eat();

        p = new NorthPerson();
        p.eat();

        System.out.println("===========传入南方人和北方人对象的方法==========");
        //创建南方人和北方人对象
        SouthPerson sp = new SouthPerson();
        NorthPerson np = new NorthPerson();
        differentEat(sp);
        differentEat(np);

    }

    public static void differentEat(Person p){
        p.eat();
    }
}

class Person {
    public void eat() {
        System.out.println("人要吃饭");
    }
}

class SouthPerson extends Person {
    @Override
    public void eat() {
        System.out.println("南方人吃炒菜和米饭");
    }
}

class NorthPerson extends Person {
    @Override
    public void eat() {
        System.out.println("北方人吃烩菜和馒头");
    }
}