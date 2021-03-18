package com.zqs.dayhomework.day07_oop3.test04.arraytool;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: ArrayTool测试类
 * @author: z_qingshan
 * @create: 2021-03-06
 **/
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 5, 1, 4, 4, 41, 32};
        double[] drr = {2.1, 3.4, 51.5, 16.4, 46.7, 4.8, 41.1, 32.9};

        //整型数组
        System.out.println("整型数组");
        ArrayTool.traverse(arr);
        System.out.println("最大值是：" + ArrayTool.getMaxNumber(arr));
        System.out.println("最小值是：" + ArrayTool.getMinNumber(arr));

        System.out.println("--------------------------------");
        //浮点型数组
        System.out.println("浮点型数组");
        ArrayTool.traverse(drr);
        System.out.println("最大值是：" + ArrayTool.getMaxNumber(drr));
        System.out.println("最小值是：" + ArrayTool.getMinNumber(drr));

        System.out.println("--------------------------------");

        //逆置整型数组
        System.out.println("======数组未逆置前======");
        ArrayTool.traverse(arr);
        System.out.println("======数组逆置后======");
        ArrayTool.invertedArray(arr);

        //逆置浮点型数组
        System.out.println("\n======数组未逆置前======");
        System.out.println(Arrays.toString(drr));
        System.out.println("======数组逆置后======");
        ArrayTool.invertedArray(drr);

        //查找整型数组元素
        System.out.println();
        ArrayTool.traverse(arr);
        System.out.print("输入要查找的元素：");
        int input = sc.nextInt();

        if (ArrayTool.seqSearchFirst(arr, input) == -1) {
            System.out.println(input + "不在数组中");
        } else {
            System.out.println(input + "在数组中第一次出现的下标是：" + ArrayTool.seqSearchFirst(arr, input));
            System.out.println(input + "在数组中最后一次出现的下标是：" + ArrayTool.seqSearchEnd(arr, input));
        }

        //查找浮点型数组元素
        System.out.println();
        ArrayTool.traverse(drr);
        System.out.print("输入要查找的元素：");
        double dou = sc.nextDouble();

        if (ArrayTool.seqSearchFirst(drr, dou) == -1) {
            System.out.println(dou + "不在数组中");
        } else {
            System.out.println(dou + "在数组中第一次出现的下标是：" + ArrayTool.seqSearchFirst(drr, dou));
            System.out.println(dou + "在数组中最后一次出现的下标是：" + ArrayTool.seqSearchEnd(drr, dou));
        }

        sc.close();
    }
}
