package com.zqs.other;

import java.util.Scanner;

/**
 * @description: 输入工具类
 * @author: z_qingshan
 * @create: 2021-03-10
 **/
public class Scannertool {

    private Scannertool() {
    }

    private static final Scanner sc = new Scanner(System.in);

    public static Student setStuInfo() {
        System.out.print("请输入要录入学生的学号：");
        String tempStringStuId = sc.nextLine();
        int stuId = Integer.parseInt(tempStringStuId);
        System.out.print("请输入要录入学生的姓名：");
        String name = sc.nextLine();
        System.out.print("请输入要录入学生的性别：");
        String sex = sc.nextLine();
        System.out.print("请输入要录入学生的班级：");
        String clazz = sc.nextLine();
        System.out.print("请输入要录入学生的年龄：");
        String tempStringAge = sc.nextLine();
        int age = Integer.parseInt(tempStringAge);
        System.out.print("请输入要录入学生的电话号码：");
        String phoneNum = sc.nextLine();

        //创建对象,并返回
        return new Student(stuId, name, sex, age, clazz, phoneNum);


    }
}