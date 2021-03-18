package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test34 {
    public static void main(String[] args) {
        //34 取一个整数a从右端开始的4～7位。如1234567，取1234

        /*int a = 1234567;
        //将整数a转为字符串
        String num = a + "";
        System.out.println(num);
        System.out.println(num.substring(0, 4));*/

        System.out.println("请输入一个不下于7数：");
        int x = new Scanner(System.in).nextInt();
        x = x / 1000;
        x = x % 10000;
        System.out.println("原数从右端开始的4~7位为：" + x);
    }
}
