package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test33 {
    public static void main(String[] args) {
        //33 将一个数组逆序输出。
        int[] arr = new int[10];

        //赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        //遍历打印数组
        System.out.println("====数组元素为====");
        for (int i : arr) {
            System.out.print(i + "\t");
        }

        //用第一个与最后一个交换，以此类推
        /*
        1、把arr[0] 和 arr[5]进行交换 {66, 22, 33, 44, 55, 11}
        2、把arr[1] 和 arr[4]进行交换 {66, 55, 33, 44, 22, 11}
        3、把arr[2] 和 arr[3]进行交换 {66, 55, 44, 33, 22, 11}
        4、一共要交换 3次 = arr.length / 2
        5、每次交换时，对应的下标是 arr[i] 和 arr[arr.length - 1 - i]
         */
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
        //遍历打印逆序数组
        System.out.println("\n====逆序数组元素为====");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
