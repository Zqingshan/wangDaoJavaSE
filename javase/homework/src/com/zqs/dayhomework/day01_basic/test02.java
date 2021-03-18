package com.zqs.dayhomework.day01_basic;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-03-01
 */
public class test02 {
    public static void main(String[] args) {
        //利用键盘输入 你个人的 三门学科成绩，然后，
        // 分别求出 三科成绩的平均分，最低分，最高分，三科的总分

        //第2题
        int sum = 0; //总分

        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一门学科成绩：");
        int score1 = sc.nextInt();
        System.out.print("输入第二门学科成绩：");
        int score2 = sc.nextInt();
        System.out.print("输入第三门学科成绩：");
        int score3 = sc.nextInt();

        //总分
        sum = score1 + score2 + score3;
        //最低分，最高分
        int maxGrades = score1 > score2 ? (score1 > score3 ? score1 : score3) : (score2 > score3 ? score2 : score3);
        int minGrades = score1 < score2 ? (score1 < score3 ? score1 : score3) : (score2 < score3 ? score2 : score3);
        System.out.println("总分是：" + sum + "，平均分是" + (sum / 3) + "分，最高分是" + maxGrades + "，最低分是" + minGrades);
    }
}
