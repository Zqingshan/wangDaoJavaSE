package com.zqs.javase.oop3_wangdao.chain6;

/**
 * @description: 链式调用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = s.getStudent();
        Teacher t = s2.getTeacher();
        t.show();

        //以上过程都可以合起来
        new Student().getStudent().getTeacher().show();
        //链式调用在后续开发中很常见 EE/框架
        //链式调用不要写的太长，可以适当砍断一点
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