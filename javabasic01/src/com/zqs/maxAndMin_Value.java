package com.zqs;

/**
 * @description: 各进制最大值和最小值
 * @author: z_qingshan
 * @create: 2021-03-05
 **/
public class maxAndMin_Value {
    public static void main(String[] args) {
        //Integer是int的包装类
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + 1);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println("----------------");
        //Byte
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE + 1);
        System.out.println((byte) (Byte.MAX_VALUE + 1));
        System.out.println("----------------");

        //Short
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MAX_VALUE + 1);
        System.out.println((short) (Short.MAX_VALUE + 1));
    }
}
