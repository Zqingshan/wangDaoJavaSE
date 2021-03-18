package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test38 {
    public static void main(String[] args) {
        //38 输入2个数字，数字一记做a,数字二记做b.求s=a+aa+aaa+aaaa+aa...a的值，例如a=2，b=5，则s=2+22+222+2222+22222
        Scanner sc = new Scanner(System.in);
        System.out.print("输入a：");
        int a = sc.nextInt();
        System.out.print("输入b：");
        int b = sc.nextInt();

        int sum = 0, num = 0;
        //累加
        for (int i = 1; i <= b; i++) {
            num += a; //每一项的值
            a = a * 10;
            sum += num;
        }
        System.out.println(sum);
        sc.close();
    }
}
