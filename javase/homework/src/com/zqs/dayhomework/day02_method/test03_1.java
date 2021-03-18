package com.zqs.dayhomework.day02_method;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-03-02
 */
public class test03_1 {
    //利用键盘输入 你个人的 三门学科成绩，然后，
    // 分别求出 三科成绩的平均分
    public static double avgScore(double score1, double score2, double score3) {
        double sum = score1 + score2 + score3;
        return sum / 3;
    }

    public static void main(String[] args) {
        //把day01作业中两道题 用方法进行改造
        // 比如求平均分的方法，求缴税的方法等

        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的三科成绩：");
        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();
        System.out.println("你的三科成绩的平均分是=" + avgScore(score1, score2, score3));
        sc.close();
    }

}
