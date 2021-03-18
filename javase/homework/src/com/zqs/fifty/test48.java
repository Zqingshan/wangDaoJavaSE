package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test48 {
    public static void main(String[] args) {
        //48 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数.
        // 比如输入数字为1234567890，m=4，则结果为7890123456

        int N = 10; //数组长度
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[N];
        //使用1-10的随机数赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
        //遍历打印arr数组
        System.out.print("你输入的数组为：");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n请输入向后移动的位数：");
        int m = sc.nextInt();

        //创建新数组
        int[] arrNew = new int[m];
        //移动元素
        for (int i = 0; i < m; i++) {
            arrNew[i] = arr[N - m + i];
        }
        //将arr前N-m位元素往后移
        for (int i = N - 1; i >= m; i--) {
            arr[i] = arr[i - m];
        }
        //把arrNew的前m位元素赋值到arr前m位中
        for (int i = 0; i < m; i++) {
            arr[i] = arrNew[i];
        }
        System.out.print("位移后的数组是：");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
