package com.zqs.dayhomework.day04_array2;

import java.util.Scanner;

/**
 * @description: 已知有3个班级（1到3班），分别有3人，2人，5人
 * 键盘录入每个班级的学生的成绩 请使用二维数组存储数据
 * 计算每个班级的平均成绩，每个班级中的最高成绩和最低成绩，并输出
 * @author: z_qingshan
 * @create: 2021-03-04
 **/
public class test03 {
    public static void main(String[] args) {
        int[][] scores = new int[3][];
        Scanner sc = new Scanner(System.in);
        //输入每个班的人数
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "班的人数：");
            scores[i] = new int[sc.nextInt()];
        }
        //赋值，输入成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "班的成绩：");
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = sc.nextInt();
            }
        }
        //遍历输出二维数组
        /*for (int[] i : scores) {
            System.out.println(Arrays.toString(i));
        }*/
        getAvgScores(scores); //调用求平均分方法
        getMaxScores(scores); //调用求最高分方法
        getMinScores(scores); //调用求最低分方法
    }

    //每个班级的平均分
    public static void getAvgScores(int[][] scores) {
        System.out.println("======================================");
        for (int i = 0; i < scores.length; i++) {
            double sum = 0.0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j]; //每个班的总分
            }
            System.out.println("第" + (i + 1) + "班平均分=" + (sum / scores[i].length));
        }
        System.out.println("======================================");
    }

    //最高分，最低分
    public static void getMaxScores(int[][] scores) {
        for (int i = 0; i < scores.length; i++) {
            int max = scores[i][0];
            for (int j = 0; j < scores[i].length; j++) {
                //如果max比scores[i][0]小，则max=scores[i][j]
                if (max < scores[i][j]) {
                    max = scores[i][j];
                }
            }
            System.out.println("第" + (i + 1) + "班最高分是" + max);
        }
        System.out.println("======================================");
    }
    public static void getMinScores(int[][] scores) {
        for (int i = 0; i < scores.length; i++) {
            int min = scores[i][0];
            for (int j = 0; j < scores[i].length; j++) {
                //如果min比scores[i][0]大，则min=scores[i][j]
                if (min > scores[i][j]) {
                    min = scores[i][j];
                }
            }
            System.out.println("第" + (i + 1) + "班最低分是" + min);
        }
        System.out.println("======================================");
    }
}
