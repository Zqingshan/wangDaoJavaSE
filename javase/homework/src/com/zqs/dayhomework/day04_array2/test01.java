package com.zqs.dayhomework.day04_array2;

import java.util.Arrays;

/**
 * @description: 1, 长风去参加快乐男声比赛, 有10个评委打分, (去掉一个最高一个最低)
 * 求最后的平均成绩 提示：用数组装这些分数，并找到最大值和最小值去掉他们，然后算平均值。
 * 要求：必须提供三个方法：求最大值，最小值，平均分
 * @author: z_qingshan
 * @create: 2021-03-04
 **/
public class test01 {
    public static void main(String[] args) {
        //定义一个数组
        int[] scores = {76, 56, 87, 98, 65, 23, 67, 87, 75, 34};
        System.out.println("成绩如下：" + Arrays.toString(scores));
        System.out.println("最高分是：" + getMaxScore(scores));
        System.out.println("最低分是：" + getMinScore(scores));
        getAvgScore(scores);
    }

    //求最大值
    public static int getMaxScore(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        return max;
    }

    //求最小值
    public static int getMinScore(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (min > scores[i]) {
                min = scores[i];
            }
        }
        return min;
    }

    //求平均分
    public static void getAvgScore(int[] scores) {
        double sum = 0;
        System.out.print("平均分是：");
        int max = getMaxScore(scores); //最高分
        int min = getMinScore(scores); //最低分
        for (int i = 0; i < scores.length; i++) {
            //判断 scores元素不等于最高分和最低分时累加
            if (scores[i] != max && scores[i] != min) {
                sum += scores[i];
            }
        }
        System.out.println(sum / 8);
    }
}
