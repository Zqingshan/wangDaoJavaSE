package com.zqs.dayhomework.day03_array;

import java.util.Arrays;

/**
 * @description: 自己手写一下数组的遍历，感受一下完善代码的过程，可以参考我的代码
 * @author: z_qingshan
 * @create: 2021-03-03
 **/
public class test01 {
    public static void main(String[] args) {
        //定义一个数组并随机赋值
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        //遍历数组方式1  调用方法
        System.out.println("----------调用方法遍历数组----------");
        printArray(arr);

        //遍历数组方式2 普通for循环
        System.out.println("\n\n----------for循环遍历数组----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //遍历数组方式3  foreach
        System.out.println("\n\n----------for each循环遍历数组----------");
        for (int i : arr) {
            System.out.print(i + "\t");
        }

        ////遍历数组方式4  Arrays.toString
        System.out.println("\n\n----------Arrays.toString遍历数组----------");
        System.out.println(Arrays.toString(arr));
    }

    //创建遍历数组方法
    public static void printArray(int[] arr) {
        if (arr != null) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                //最后一个元素不加逗号
                if (i == arr.length - 1) {
                    System.out.print(arr[i] + "]");
                } else {
                    System.out.print(arr[i] + ", ");
                }
            }
        } else {
            System.out.println("你输入的数据有误，请重新输入");
        }
    }
}
