package com.zqs.controflow.select;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-01-25 20:19
 */
public class Demo1Select {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        /*int input = sc.nextInt();

        if (input > 0) {
            System.out.println("你输入的是正数" + input);
        }else if(input == 0){
            System.out.println("你输入的是0");
        }else{
            System.out.println("你输入的是负数" + input);
        }*/

        //练习
        //1、键盘录入x的值，计算出y的并输出
        /*x和y的关系满足如下：
        x>=3	   y = 2x + 1;
        -1<=x<3	  y = 2x;
        x<=-1	  y = 2x – 1;*/

        //int x = sc.nextInt();
        /*int y;

        if(x >= 3){
            y = 2 * x + 1;
        }else if (x >= 1 && x < 3){
            y = 2 * x;
        }else{
            y = 2 * x - 1;
        }
        System.out.println("x = " + x + "-----" + "y = " + y);*/

        //键盘录入月份的值，输出对应的季节
        /*12 1 2 冬季
        3 4 5 春季
        6 7 8 夏季
        9 10 11 秋季*/

        /*if ( x == 12 || x == 1 || x == 2) {
            //冬季
            System.out.println(x + "月是冬季");
        } else if ( x >= 3 && x <= 5) {
            //春季
            System.out.println(x + "月是春季");
        } else if ( x >= 6 && x <= 8) {
            //夏季
            System.out.println(x + "月是夏季");
        } else if ( x >= 9 && x <= 11) {
            //秋季
            System.out.println(x + "月是秋季");
        } else {
            //输入有误
            System.out.println("你输入的月份有误，请重新输入");
        }*/

        //3、获取三个数值中的最大值
        int a = 20;
        int b = 15;
        int c = 35;

        //if嵌套实现
        /*if (a > b){
            //a大
            if (a > c){
                //a大
                System.out.println("最大值是 " + a);
            }else{
                //c大
                System.out.println("最大值是 " + c);
            }
        } else {
            //b大
            if (b > c) {
                //b大
                System.out.println("最大值是 " + b);
            } else {
                //c大
                System.out.println("最大值是 " + c);
            }
        }*/

        //非嵌套方式，使用中间变量
        int tmp;
        if (a > b) {
            tmp = a;
        }else {
            tmp = b;
        }

        if (tmp > c) {
            System.out.println("最大值是 " + tmp);
        }else {
            System.out.println("最大值是 " + c);
        }


    }
}
