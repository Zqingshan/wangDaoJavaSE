package com.zqs.dayhomework.day02_method;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-03-02
 */
public class test04 {
    //创建方法
    public static void printGraphics(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //4， 使用方法：根据键盘录入打印x行y列的井号
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要打印的行数和列数:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        printGraphics(row, col); //调用方法
    }
}
