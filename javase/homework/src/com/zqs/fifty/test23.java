package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test23 {
    public static void main(String[] args) {
        //23 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
        /*
        分子 2 3 5 8 13 21
        分母 1 2 3 5 8 13
         */
        //分母: denom 分子：mole
        double denom = 1, mole = 2;
        double sum = 0;
        double temp;
        for (int i = 1; i <= 20; i++) {
            sum += (double) mole / denom;

            //方法1
            /*
            mole = denom + mole; //新分子等于前一项分子+前一项分母
            denom = mole - denom; //新分母等于新分子-前一项的分母
           */

            //方法2
            temp = denom;
            denom = mole; //后一项的分母等于前一项的分子
            mole = temp + mole; //后二项分子等于前一项分子+前一项分母
        }
        System.out.println(sum);
    }
}
