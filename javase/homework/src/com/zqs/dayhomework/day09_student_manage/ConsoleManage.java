package com.zqs.dayhomework.day09_student_manage;


import com.stage3.utils.ScannerUtils;

import java.util.Scanner;

/**
 * @description: 王道学生管理系统
 * @author: z_qingshan
 * @create: 2021-03-10
 **/
public class ConsoleManage {
    //学生列表对象 需要在这个类中使用，所以作为它的成员变量
    //默认的长度是10
    private StudentList sls = new StudentList(10);

    //默认无参构造里，加几个Student对象作为数组的初始值
    public ConsoleManage() {
        Student s1 = new Student(1, "张三", "男", "Java30th", 18, "18888888888");
        Student s2 = new Student(2, "李四", "女", "Java30th", 28, "17777777777");
        //调用方法 加进数组中
        sls.createStudent(s1);
        sls.createStudent(s2);
    }

    public static void main(String[] args) {
        ConsoleManage cm = new ConsoleManage();
        cm.start();
    }


    public void start() {
        //该标志指示循环是否继续进行,即是否仍然输出菜单
        boolean loopFlag = true;
        while (loopFlag) {
            //调用方法,输出菜单
            showMenu();
            //键盘录入 选择对应功能
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    consoleGetAllStudent();
                    break;
                case 2:
                    consoleCreateStudent();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("确认退出吗（1/2）：");
                    int quitFlag = sc.nextInt();
                    if (quitFlag == 1) {
                        loopFlag = false;
                        System.out.println("感谢使用本系统！");
                    }
                    break;
            }
        }
    }

    private void consoleGetAllStudent() {
        System.out.println("---------------------------学生列表---------------------------");
        //调用方法获取学生对象数组
        Student[] allStudent = sls.getAllStudent();
        if (allStudent.length == 0) {
            //没有记录!
            System.out.println("没有学生信息记录!");
        } else {
            System.out.println("学号\t姓名\t性别\t年级\t\t年龄\t\t电话号码");
            for (int i = 0; i < allStudent.length; i++) {
                allStudent[i].getStudentInfo();
            }
        }
    }

    private void consoleCreateStudent() {
        System.out.println("---------------添加学生信息-------------------");
        //调用工具类中的方法,得到一个学生对象
        Student s = ScannerUtils.getStudentInstanceByScanner();
        //将该对象放进sls对象的数组中
        if (sls.createStudent(s)) {
            //方法返回true 表示存入学生信息成功
            System.out.println("存入信息成功!");
        } else {
            System.out.println("存入失败,可能是数组空间已满!");
        }
    }

    private void consoleSearchStudent(){

    }

    private void showMenu() {
        System.out.println("\n-----------------王道Java学生管理系统-----------------\n");
        System.out.println("                   1.学 生 列 表");
        System.out.println("                   2.增 加 学 生");
        System.out.println("                   3.删 除 学 生");
        System.out.println("                   4.修 改 学 生");
        System.out.println("                   5.查 询 学 生");
        System.out.println("                   6.退 出 系 统\n");
        System.out.print("请选择功能(1-6)：");
    }

}
