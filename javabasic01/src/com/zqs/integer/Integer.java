package com.zqs.integer;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @author z_qingshan
 * @create 2021-03-01
 */
public class Integer {
    public static void main(String[] args) {
        int binVal01 = 0b11010100;
        byte binVal02 = 0B01101001;
        //定义一个32为的二进制整数，最高位是符号位
        int binVal03 = 0B10000000000000000000000000000011; //补码
        //反码（补码减1得到反码）      10000000000000000000000000000010
        //原码（符号位不变，其它位取反）11111111111111111111111111111101 ->-2147483645
        System.out.println(binVal01);
        System.out.println(binVal02);
        System.out.println(binVal03);

        /*
        定义一个8位的二进制整数，该数值默认占32位，因此它是一个正数
        只是强制类型转换成byte时产生了溢出，最终导致binVal04变成了-23
         */
        byte binVal04 = (byte) 0b11101001;

        /*
        定义一个32位的二进制整数，最高位是1
        但由于数值后添加了L后缀，因此该整数实际占64位，第32位的1不是符号位
        因此binVal05的值等于2的31次方 + 2 + 1
         */
        long binVal05 = 0B10000000000000000000000000000011L;
        System.out.println(binVal04);
        System.out.println(binVal05);
        /*
        上面程序中粗体字代码与前面程序片段的粗体字代码基本相同，只是在定义二进制整数时添加了"L" 后缀，
        这就表明把它当成 long 类型处理，因此该整数实际占 64 位 。 此时的第 32 位不再是符号位，
        因此它依然是一个正数 。
        至于程序中的 byte binVal4 = (byte)Ob 111 0 100 1 ;代码，其中 Obl1101001 依然是一个 32 位的正整数 ，
        只是程序进行强制类型转换时发生了溢出，导致它变成了负数 。
         */

    }
}
