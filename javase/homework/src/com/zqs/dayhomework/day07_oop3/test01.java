package com.zqs.dayhomework.day07_oop3;

import java.util.Scanner;

/**
 * @description: 编写一个猜数小游戏
 * 先成一个随机数（1~100的整数，自己百度Java如何生成随机数）
 * 再键盘输入猜测的数（因为不太可能一次就猜中，这个过程需要多次，用什么循环做？）
 * 如果猜的数大了或者小了，给出提示，继续猜，直到猜中为止
 * @author: z_qingshan
 * @create: 2021-03-08
 **/
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //生成随机数
        int guessNum = (int) (Math.random() * 100);
        //游戏继续的条件
        boolean flag = true;

        while (flag) {
            //System.out.println(guessNum);

            System.out.print("猜一猜我出的数是多少：");
            int input = sc.nextInt();

            if (input > guessNum) {
                System.out.println("猜的数字有点大\n");
            } else if (input < guessNum) {
                System.out.println("猜的数字有点小\n");
            } else {
                System.out.println("猜中啦~~\n");
                System.out.println("是否继续玩？1：继续，2：退出");
                int quitNum = sc.nextInt();
                //判断是否退出
                if (quitNum == 1) {
                    //继续玩则新生成一个随机数
                    guessNum = (int) (Math.random() * 100);
                    flag = true;
                } else if (quitNum == 2) {
                    System.out.println("退出游戏，欢迎下次再玩");
                    flag = false;
                } else {
                    System.out.println("输入有误，直接退出游戏");
                    flag = false;
                }

            }
        }
    }
}

