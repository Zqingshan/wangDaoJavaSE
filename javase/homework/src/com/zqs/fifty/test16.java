package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test16 {
    public static void main(String[] args) {
        //题目：打印出如下图案（三角形）
        //    *
        //   ***
        //  *****
        // *******
        for (int i = 1; i <= 4; i++) { //控制行
            for (int j = 1; j <= 4-i; j++) { //控制空格
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) { //打印*
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
