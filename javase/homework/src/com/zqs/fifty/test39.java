package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test39 {
    public static void main(String[] args) {
        //39 输入两个正整数m和n，求其最大公约数和最小公倍数。

        Scanner sc = new Scanner(System.in);
        System.out.print("输入正整数m：");
        int m = sc.nextInt();
        System.out.print("输入正整数n：");
        int n = sc.nextInt();

        /*
        （1）对于已知两个整数m、n，假设 m > n;
        （2）计算m除以n，将得到的余数记为re；
        （3）如果 re=0，则n为所求得的最大公约数，否则执行下一步；
        （4）将n的值保存到m中，将re的值保存到n中，重复执行（2）（3），直到re=0，便可得到最大公约数。
         */
        int max, min, re; //较大的数，较小的数，余数
        if (m > n) {
            max = m;
            min = n;
        } else {
            max = n;
            min = m;
        }
        re = max % min; //求余数
        //辗转相除
        while (re != 0) {
            max = min;
            min = re;
            re = max % min;
        }

        //最小公倍数
        // 将两数相乘的积除以最大公约数便可得到两数的最小公倍数
        int lcm; //lcm 最小公倍数
        lcm = (m * n) / min; //求出最小公倍数

        System.out.println("数" + m + "和数" + n + "最大公约数为" + min);
        System.out.println("数" + m + "和数" + n + "最小公倍数为" + lcm);
    }
}
