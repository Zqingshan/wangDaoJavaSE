package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test35 {
    public static void main(String[] args) {
        //35 求0—7所能组成的奇数个数。

        //组成1位数是4个
        //组成2位数是7*4个
        //组成3位数是7*8*4个
        //组成4位数是7*8*8*4个

        int sum = 4;
        System.out.println("组成1位数是 " + sum + " 个");
        sum = sum * 7;
        System.out.println("组成2位数是 " + sum + " 个");
        for (int j = 3; j <= 9; j++) {
            sum = sum * 8;
            System.out.println("组成" + j + "位数是 " + sum + " 个");
        }


    }
}
