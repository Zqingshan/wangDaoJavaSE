package com.zqs.other;

/**
 * @description: 学生类
 * @author: z_qingshan
 * @create: 2021-03-10
 **/
public class Student {
    private int stuId;
    private String name;
    private String sex;
    private int age;
    private String clazz;
    private String phoneNum;

    public String getName() {
        return name;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void getInfo()
    {
        System.out.println("学号："+stuId+" 姓名："+this.name+" 年龄："+this.age+" 性别："+this.sex+" 班级："+this.clazz+" 手机号："+ this.phoneNum);
    }

    public Student() {
    }

    public Student(int stuId, String name, String sex, int age, String clazz, String phoneNum) {
        this.stuId = stuId;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.clazz = clazz;
        this.phoneNum = phoneNum;
    }
}
