package com.zqs.dayhomework.day04_array2;

import java.util.Scanner;

/**
 * @description: 4，使用递归，把十进制数转换成二进制数
 * @author: z_qingshan
 * @create: 2021-03-04
 **/
public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int input = sc.nextInt();
        System.out.println(input + "的二进制表示是：");
        toBinary(input);
    }

    // 使用递归，把十进制数转换成二进制数
    public static void toBinary(int n) {
        if (n / 2 == 0) {
            System.out.println(n % 2);
        } else {
            toBinary(n / 2);
            System.out.println(n % 2);
        }
    }
}
