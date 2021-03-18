package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test27 {
    public static void main(String[] args) {
        //27 求100之内的素数
        for (int i = 1; i <= 100; i++) {
            int j = 2;
            while (i > j) {
                if (i % j == 0) { //当i被小于它的数整除，表示该数不是素数，跳出循环
                    break;
                }
                j++;
            }
            //如果i没有被小于它的数整除，则该数是素数
            if (i == j) {
                System.out.print(i + "\t");
            }
        }
    }
}
