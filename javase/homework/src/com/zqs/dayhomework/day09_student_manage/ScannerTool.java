package com.zqs.dayhomework.day09_student_manage;

import java.util.Scanner;

/**
 * @description: 输入工具类
 * @author: z_qingshan
 * @create: 2021-03-10
 **/
public class ScannerTool {
    //需要一个Scanner对象,用来做键盘录入,该对象全局唯一
    private static final Scanner sc = new Scanner(System.in);

    //私有化构造方法
    private ScannerTool() {
    }

    //根据键盘录入,封装成一个Student对象,返回
    public static Student getStudentInstanceByScanner(){
        //为了避免Scanner有异常错误,全部采用nextLine()接收字符串,然后转换类型
        System.out.print("请输入要录入学生的学号：");
        String tempStringStuId = sc.nextLine();
        int stuId = Integer.parseInt(tempStringStuId);
        System.out.print("请输入要录入学生的姓名：");
        String name = sc.nextLine();
        System.out.print("请输入要录入学生的性别：");
        String gender = sc.nextLine();
        System.out.print("请输入要录入学生的班级：");
        String grade = sc.nextLine();
        System.out.print("请输入要录入学生的年龄：");
        String tempStringAge = sc.nextLine();
        int age = Integer.parseInt(tempStringAge);
        System.out.print("请输入要录入学生的电话号码：");
        String phoneNum = sc.nextLine();

        //创建对象，并返回
        return new Student(stuId,name,gender,grade,age,phoneNum);
    }
}
