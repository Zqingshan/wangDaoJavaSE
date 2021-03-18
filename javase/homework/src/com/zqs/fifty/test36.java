package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test36 {
    public static void main(String[] args) {
        //36 读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。

        int[] arr = new int[7];
        //赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 49) + 1;
        }
        //输出数组并打印*
        for (int i : arr) {
            System.out.print(i + "\t");
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
