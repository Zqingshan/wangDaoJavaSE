package com.zqs.dayhomework.day01_basic;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-03-01
 */
public class test04 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
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
            switch (input) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.print("确认是否退出（1/2）:");
                    int quitFlag = sc.nextInt();
                    if (quitFlag == 1) {
                        //用户确认退出
                        flag = false;
                        System.out.println("感谢使用本系统");
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }

    }
}
