package com.zqs;

/**
 * @author z_qingshan
 * @create 2021-03-01
 */
public class Conversion {
    public static void main(String[] args) {
        short a = 1;
        short b = 2;
        int i = a + b;
        short c = (short) (a + b);
        System.out.println(i);
        System.out.println(c);

    }
}
