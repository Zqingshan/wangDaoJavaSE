package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test22 {
    public static void main(String[] args) {
        //22题 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
        /*
        Java中substring的用法
        String str = "Hello World";
        用法1：substring(int beginindex)
                返回从起始位置（beginindex）至字符串末尾的子字符串
                str.substring(2);
                --> llo world

        用法2：substring(int beginindex,int endindex)
                返回从起始位置（beginindex）到目标位置（endindex）之间的字符串，不包括起始位置（beginindex）
                str.substring(2,4)
                --> ll
         */

        System.out.print("输入一个不多于5位的数：");
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //输入数字
        System.out.println(input + "是一个" + input.length() + "位数"); //length输出字符串的长度
        System.out.println("逆序打印");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.substring(i, i + 1)); //返回从i到i+1之间的字符串
        }
    }
}
