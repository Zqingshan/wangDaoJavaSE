package com.zqs.dayhomework.day14_exception;

/**
 * @description: 第一题
 * @author: z_qingshan
 * @create: 2021-03-16
 **/

import java.util.Scanner;

/**
 * 接收键盘录入字符串，把该字符串转换成int数值，
 * 思考如果用户键入的不是int数值，用异常处理合理的提示用户，并使程序不会终止
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("输入int数值字符串：");
            String input = sc.next();
            int parseInt = Integer.parseInt(input);   //字符串转成int数值
            System.out.println("你输入的内容为：" + parseInt);
        } catch (NumberFormatException e) {
            System.out.println("输入int数值字符串，不能输入字母");
        }
    }
}
