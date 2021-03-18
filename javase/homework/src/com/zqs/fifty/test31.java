package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test31 {
    public static void main(String[] args) {
        //31 输入3个数a,b,c，按大小顺序输出。

        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("输入第" + (i + 1) + "个数：");
            arr[i] = sc.nextInt();
        }

        //遍历数组
        System.out.println("====原数组====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //冒泡排序进行排序
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) { //如果后一个数小于前一个数，则交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //遍历数组
        System.out.println("\n====排序后====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
