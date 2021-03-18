package com.zqs.fifty;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test09 {
    public static void main(String[] args) {
        //任给一个int类型的正整数，如何判断该整数的值，是否是2的整数次幂？
        System.out.print("输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input % 2 == 0) { //对2求余为0，就是2的整数次幂
            System.out.println(input + "是2的整数次幂");
        } else {
            System.out.println(input + "不是2的整数次幂");
        }
        sc.close();

    }
}
