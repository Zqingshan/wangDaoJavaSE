package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test17 {
    public static void main(String[] args) {
        //输出九九乘法表
        for (int i = 1; i <= 9; i++) { //控制行
            for (int j = 1; j <= i; j++) { //控制列
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------");

        //倒三角九九乘法表
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
