package com.zqs.javase.oop3_wangdao.homework2;

/**
 * @description: 作业1
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

/**
 * 2，现在动物园来了一批动物
 * 共同的：
 * 属性：种类，名字，年龄
 * 行为：表演
 * 请设计这个体系，自定义几个具体动物类
 *
 */
public class Work2 {
    public static void main(String[] args) {
        Animal a;
        a = new Cat();
        a.perform();
    }
}
abstract class Animal{
    String species;
    int age;
    String name;

    public abstract void perform();
}
class Cat extends Animal{

    @Override
    public void perform() {
        System.out.println("猫会卖萌");
    }
}
class Elephant extends Animal{

    @Override
    public void perform() {
        System.out.println("大象会吹口哨");
    }
}

class Student{

    public Student getStudent(){
        return new Student();
    }

    public Teacher getTeacher(){
       return new Teacher();
    }
}
class Teacher{
    public void show(){
        System.out.println("秀一波~~~");
    }
}

