package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test25 {
    public static void main(String[] args) {
        //25题 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("输入一个5位数:");
            String input = sc.next();
            String str = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                str = str + input.substring(i, i + 1); //将输入的字符串数字逆序输出
            }
            //System.out.println(str);

            //逆序输出的数与原来的数做比较,相同则是回文数
            if (input.equals(str)) {
                System.out.println(input + "是回文数");
            } else {
                System.out.println(input + "不是回文数");
            }
        } while (true);

        //sc.close();
    }
}
