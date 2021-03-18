package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test15 {
    public static void main(String[] args) {
        //输入三个整数x,y,z，请把这三个数由小到大输出。
        int temp = 0;
        System.out.print("输入三个数：");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        //如果number1大于number2，那么通过中间变量让这两个数字交换位置
        if (number1 > number2){
            temp = number1;
            number1 = number2; //此时number1为两数的小数
            number2 = temp; //此时number2为两数的大数
        }

        //如果number1大于number3，那么通过中间变量让这两个数字交换位置，将大的数往后移
        if (number1 > number3){
            temp = number1;
            number1 = number3;
            number3 = temp;
        }

        if (number2 > number3){
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        System.out.print(number1 + " " + number2 + " " + number3);
    }
}
