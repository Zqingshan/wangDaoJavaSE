package com.zqs.dayhomework.day02_method;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-03-02
 */
public class test07 {
    public static void main(String[] args) {
        //声明一个double数组用来存放三位同学的成绩，求平均值

        int sum = 0;
        double[] scores = new double[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("输入三位同学的成绩:");
        for (int i = 0; i < 3; i++) {
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }
        //遍历数组
        System.out.println("三位同学的成绩是：");
        for (int i = 0; i < 3; i++) {
            System.out.print(scores[i] + "\t");
        }
        System.out.println("\n总分是=" + sum + "平均分是=" + (sum / 3));
        sc.close();

        System.out.println("----------------------------------------------");

        // 声明一个String数组，然后输出该数组的长度，元素等
        String[] str = {"A", "B", "C", "D", "E"};
        System.out.println("数组的长度是" + str.length);
        System.out.print("数组的元素是：");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
