package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test37 {
    public static void main(String[] args) {
        //37 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。

        int[] arr = new int[7];
        //赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        //输出数组
        for (int i : arr) {
            System.out.print(i + "\t");
        }

        //求最大值和最小值
        int max = arr[0];
        int min = arr[0];
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            // 最大值
            if (max < arr[i]) {
                max = arr[i];
            }
            // 最小值
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        //交换位置
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
            }
            if (arr[i] == min) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
        }

        System.out.println("\n最大值=" + max + "，最小值=" + min);
        System.out.println("====交换位置后的数组====");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
