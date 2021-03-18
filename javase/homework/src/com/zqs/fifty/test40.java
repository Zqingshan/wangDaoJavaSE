package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test40 {
    //偶数 eNum
    public static double eNum(int n) {
        double result = 0;
        for (int i = 2; i <= n; i = i + 2) {
            result += 1 / (double) i;
        }
        return result;
    }

    //奇数 oNum
    public static double oNum(int n) {
        double result = 0;
        for (int i = 1; i <= n; i = i + 2) {
            result += 1 / (double) i;
        }
        return result;
    }

    public static void main(String[] args) {
        //40 编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n

        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个数：");
        int n = sc.nextInt();

        //判断是偶数还是奇数

        if (n % 2 == 0) { //偶数
            System.out.println(eNum(n));
        } else { //奇数
            System.out.println(oNum(n));
        }
        sc.close();
    }
}
