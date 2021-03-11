package com.zqs;

import java.math.BigInteger;

/**
 * @author z_qingshan
 * @create 2020-12-25 17:08
 */

public class bitDemo {

    public static void main(String[] args) {
        /*int word_01 = 1;
        int word_02 = 2;
        System.out.println("bitDemo" + word_01 + word_02);*/

        //自增自减运算
        /*int a = 3;
        int b = ++a;
        int c = 3;
        int d = --c;
        System.out.println("进行自增运算后的值为" + b);
        System.out.println("进行自减运算后的值为" + d);*/

        //前缀后缀运算区别
        /*int a = 5;
        int b = 5;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("自增运算符前缀运算后a=" + a + ",x=" + x);
        System.out.println("自减运算符前缀运算后b=" + b + ",y=" + y);*/

        //逻辑运算符
        /*int a = 2;
        int b = 5;

        boolean result = ((a < b) && (a == b));
        boolean result2 = ((a < b) || (a != b));

        System.out.println(result);
        System.out.println(result2);*/

        //System.out.println((-8 & 12));

        //使用中间变量交换两个变量的值
        /*int a = 3;
        int b = 5;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(("a=" + a + "," + "b=" + b));*/

        //使用^操作交换两个变量的值
        /*int a = 3;
        int b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(("a=" + a + "," + "b=" + b));*/

        //^简单的加密
        /*int a = 3;
        int b = 5;
        System.out.println("a^b = " + (a ^ b) + "," + "a^b^b = " + (a ^ b ^ b));*/

        //位移运算符
        /*int a = 24;
        System.out.println((a + "右移两位的结果是：" + (a >> 2)));
        int b = -16;
        System.out.println((b + "左移三位的结果是：" + (b << 3)));
        int c = -256;
        System.out.println((c + "无符号右移两位的结果是：" + (c >>> 2)));*/

        //byte和short做无符号右移操作
        /*byte a = (byte)(-32 >>> 1);
        short b = (short)(-128 >>> 4);
        System.out.println("byte无符号右移的结果：" + a);
        System.out.println("short无符号右移的结果：" + b);*/


        //用位运算符求一个整数(int)的绝对值(要求有代码和截图哈)
        /**
         * 方法1 ~(a - 1)
         * -7的原码 --> 10000000 00000000 00000000 00000111
         *     反码 --> 11111111 11111111 11111111 11111000
         *     补码 --> 11111111 11111111 11111111 11111001
         *
         * 补码-1   --> 11111111 11111111 11111111 11111000
         * 再按位取反 -> 00000000 00000000 00000000 00000111  --> 7
         *
         */
        /*int a = -7;
        System.out.println(~(a - 1));*/

        /**
         * 方法2 a + (a >> 31) ^ (a >> 31)
         * a = -7
         * a的补码        -->  11111111 11111111 11111111 11111001
         * a >> 31       -->  11111111 11111111 11111111 11111111
         * a + (a >> 31) -->  11111111 11111111 11111111 11111000
         *
         * a + (a >> 31) ^ (a >> 31)
         *               -->  00000000 00000000 00000000 00000111 --> 7
         *
         */
        /*a = -7;
        System.out.println(a + (a >> 31) ^ (a >> 31));*/

        /**
         * 方法3 ~a+1
         * a = -7
         * a的补码  -->  11111111 11111111 11111111 11111001
         * ~a      -->  00000000 00000000 00000000 00000110
         * ~a+1    -->  00000000 00000000 00000000 00000111 --> 7
         *
         */
        /*a = -7;
        System.out.println(~ a + 1);*/

        //有三个int变量，a,b,c假设三个变量中有两个变量的值相同，请问如何快速求出，那个和其他两个变量不同的第三个变量的值？(代码+截图)
        /*int a = 1;
        int b = 3;
        int c = 1;
        int result = (a == b) ? c : a == c ? b : a;
        System.out.println("在" + a + ","  + b + ","  + c + "三个变量中，与其他两个变量不同的值为" + result);*/


        //任给一个int类型的正整数，如何判断该整数的值，是否是2的整数次幂？(代码+截图)
        int a = 5;
        if (a % 2 == 0) {
            System.out.println(a + "是2的整数次幂");
        } else {
            System.out.println(a + "不是2的整数次幂");
        }

        //十进制转二进制
        byte[] arr = {-128};
        String str = new BigInteger(1,arr).toString(2);
        System.out.println(str);

        /*
        十进制数转为二进制
         */
        //region 十进制转为二进制
        /*short a = -32766;
        System.out.println(a);
        String binStr = Integer.toBinaryString(a);
        System.out.println(binStr);

        int b = a >> 1;
        System.out.println(b);
        String binStrb = Integer.toBinaryString(b);
        System.out.println(binStrb);

        int c = a >> 2;
        System.out.println(c);
        String binStrc = Integer.toBinaryString(c);
        System.out.println(binStrc);*/
        //endregion
    }

}
