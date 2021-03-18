package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test30 {
    public static void main(String[] args) {
        //30 判断一个数能被几个9整除。如81可以被2个9整除。

        do {
            int count = 0; // 计数
            Scanner sc = new Scanner(System.in);
            System.out.print("输入一个整数：");
            int input = sc.nextInt();

            int div = 1;
            if (input % 9 == 0) { //输入的数对9求余为0才符合条件
                while (div <= input) {
                    div *= 9; //如果输入的是81，则div=1*9=9 div=9*9=81 div=81*9=729 729>81退出while循环
                    count++;
                }
                System.out.println(input + "能被" + (count - 1) + "个9整除");
            }else {
                System.out.println(input + "不能被9整除");
            }
        }while (true);

    }
}
