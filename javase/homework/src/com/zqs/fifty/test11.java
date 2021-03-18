package com.zqs.fifty;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test11 {
    public static void main(String[] args) {
        //判断一个5位数是否是回文数（比如12321）个位等于万位，十位等于千位
        do {
            System.out.print("输入一个5位数：");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            //unit为数字的个位
            int unit = input % 10;
            //十位
            int decade = input / 10 % 10;
            //千位
            int kilobit = input / 1000 % 10;
            //万位
            int myriabit = input / 10000;

            //判断个位是否等于万位，十位是否等于千位
            if (unit == myriabit && decade == kilobit){
                System.out.println(input + "是一个回文数");
                System.out.println();
            }else {
                System.out.println(input + "不是回文数");
                System.out.println();
            }
        }while(true);
    }
}
