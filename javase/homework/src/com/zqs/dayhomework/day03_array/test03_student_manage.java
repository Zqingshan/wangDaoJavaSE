package com.zqs.dayhomework.day03_array;

import java.util.Scanner;

/**
 * @description: - 在一阶段的基础上，提取出方法，简化main方法
 * - 至少要提取出一个方法
 * @author: z_qingshan
 * @create: 2021-03-03
 **/
public class test03_student_manage {
    public static void main(String[] args) {
        //先预设学生信息
        String[] str = new String[5];
        str[0] = "张三";
        str[1] = null;
        str[2] = "王五";
        str[3] = "赵六";

        //定义循环控制变量，控制死循环结束
        boolean loopFlag = true;
        while (loopFlag) {
            System.out.println("\n-----------------王道Java学生管理系统-----------------\n");
            System.out.println("                   1.学 生 列 表");
            System.out.println("                   2.增 加 学 生");
            System.out.println("                   3.删 除 学 生");
            System.out.println("                   4.修 改 学 生");
            System.out.println("                   5.查 询 学 生");
            System.out.println("                   6.退 出 系 统\n");
            System.out.print("请选择功能(1-6)：");
            //键盘录入选择菜单
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            String name;
            //switch选择菜单
            switch (input) {
                case 1:
                    //调用学生列表方法
                    printList(str);
                    break;
                case 2:
                    //先输出学生列表
                    printList(str);
                    System.out.print("请输入要增加的学生姓名：");
                    name = sc.next();
                    //调用增加学生方法
                    addStudent(name, str);
                    break;
                case 3:
                    //先输出学生列表
                    printList(str);
                    System.out.print("输入要删除的学生姓名：");
                    name = sc.next();
                    //调用删除学生方法
                    delStudent(name, str);
                    break;
                case 4:
                    //先输出学生列表
                    printList(str);
                    System.out.print("输入要修改的学生姓名：");
                    name = sc.next();
                    //调用修改学生方法
                    modifyStudent(name, str);
                    break;
                case 5:
                    System.out.print("输入要查找的学生姓名：");
                    name = sc.next();
                    //调用查找学生方法
                    findStudent(name, str);
                    break;
                case 6:
                    //用户确定退出后询问用户 是否确认退出
                    System.out.println("确认退出吗（1/2）：");
                    int quitFlag = sc.nextInt();
                    //调用退出系统方法
                    quitSystem(quitFlag);
                    loopFlag = false;
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
        }
    }

    //输出学生列表方法
    public static void printList(String[] str) {
        System.out.println("-----学生列表如下-----");
        for (int i = 0; i < str.length; i++) {
            if (str[i] != null) {
                System.out.print(str[i] + "\n");
            }
        }
    }

    //增加学生方法
    public static void addStudent(String name, String[] str) {
        boolean flag = true;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == null) { //数组元素等于null
                str[i] = name;
                System.out.println("学生添加成功");
                flag = false; //学生添加成功，flag值为false，表示元素有null
                break;
            }
        }
        while (flag) { //flag为true，表示没有添加学生，即数组是满的
            System.out.println("数组已满，无法增加学生");
            break;
        }
        //增加学生后遍历一次数组，调用printList()方法
        printList(str);
    }

    //删除学生方法
    public static void delStudent(String name, String[] str) {
        boolean flag = true;
        //先判断数组有没有这个学生
        for (int i = 0; i < str.length; i++) {
            if (name.equals(str[i])) {
                str[i] = null;
                flag = false; //学生删除成功，flag值为false，表示元素有null
                System.out.println("删除学生成功\n");
            }
        }
        while (flag) { //flag为true，表示没有删除学生
            System.out.println("数组查无此人，请重新确认");
            break;
        }
        //删除学生后遍历一次数组
        printList(str);
    }

    //修改学生方法
    public static void modifyStudent(String name, String[] str) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        //先判断数组有没有这个学生
        for (int i = 0; i < str.length; i++) {
            if (name.equals(str[i])) {
                System.out.println("已找到该学生");
                System.out.print("输入要修改成的学生信息：");
                String newName = sc.next();
                str[i] = newName;
                flag = false; //学生删除成功，flag值为false，表示元素有null
                System.out.println("修改学生成功\n");
            }
        }
        while (flag) { //flag为true，表示没有修改学生
            System.out.println("数组查无此人，请重新确认");
            break;
        }
        //修改学生后遍历一次数组
        printList(str);
    }

    //查询学生方法
    public static void findStudent(String name, String[] str) {
        boolean flag = true;
        for (int i = 0; i < str.length; i++) {
            if (name.equals(str[i])) {
                str[i] = name;
                flag = false; //查询学生成功，flag值为false，表示元素有null
                System.out.println("学生" + name + "在数组中的下标是：" + i);
            }
        }
        while (flag) { //flag为true，表示没有这个学生
            System.out.println("数组查无此人，请重新确认");
            break;
        }
    }

    //退出系统方法
    public static void quitSystem(int quitFlag) {
        if (quitFlag == 1) {
            //用户确认退出，循环变量为false 死循环终止
            System.out.println("感谢使用本系统！");
        }
    }
}
