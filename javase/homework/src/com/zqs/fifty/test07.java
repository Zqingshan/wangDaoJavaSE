package com.zqs.fifty;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test07 {

    public static void main(String[] args) {
        //用位运算符求一个整数(int)的绝对值
        /**
         * 方法1： ~(a - 1)
         * -7的原码 --> 10000000 00000000 00000000 00000111
         *     反码 --> 11111111 11111111 11111111 11111000
         *     补码 --> 11111111 11111111 11111111 11111001
         *
         * 补码-1   --> 11111111 11111111 11111111 11111000
         * 再按位取反 -> 00000000 00000000 00000000 00000111  --> 7
         *
         */
        int a = -7;
        System.out.println(~(a - 1));

        /**
         * 方法2： a + (a >> 31) ^ (a >> 31)
         * a = -7
         * a的补码        -->  11111111 11111111 11111111 11111001
         * a >> 31       -->  11111111 11111111 11111111 11111111
         * a + (a >> 31) -->  11111111 11111111 11111111 11111000
         *
         * a + (a >> 31) ^ (a >> 31)
         *               -->  00000000 00000000 00000000 00000111 --> 7
         *
         */
        a = -7;
        System.out.println(a + (a >> 31) ^ (a >> 31));

        /**
         * 方法3： ~a+1
         * a = -7
         * a的补码  -->  11111111 11111111 11111111 11111001
         * ~a      -->  00000000 00000000 00000000 00000110
         * ~a+1    -->  00000000 00000000 00000000 00000111 --> 7
         *
         */
        a = -7;
        System.out.println(~a + 1);

    }
}
