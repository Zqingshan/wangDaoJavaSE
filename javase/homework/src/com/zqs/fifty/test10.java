package com.zqs.fifty;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test10 {
    public static void main(String[] args) {
        //根据键盘录入的数值1，2，3，…7输出对应的星期一，星期二，星期三…星期日。
        //do…while循环实现多次输入
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("输入一个数：");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期日");
                    break;
                default:
                    System.out.println("你输入的数字不在范围内，请重新输入！");
                    break;
            }
        }while (true);
    }
}
