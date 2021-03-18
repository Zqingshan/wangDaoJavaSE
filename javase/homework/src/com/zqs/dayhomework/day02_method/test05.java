package com.zqs.dayhomework.day02_method;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-03-02
 */
public class test05 {
    //新建方法 打印乘法表
    public static void multiTable(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 5，使用方法：根据键盘录入打印nn乘法表
        Scanner sc = new Scanner(System.in);
        System.out.println("输入乘法表的范围:");
        int num = sc.nextInt();
        multiTable(num);
    }
}
