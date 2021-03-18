package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test47 {
    public static void main(String[] args) {
        //47 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。

        /*
        1、先定位，找到要插入的位置下标
        2、扩容，创建一个新数组，长度是原数组的长度加1，再把原来数组的内容拷贝到新数组，在这期间，跳过index的位置
        3、把原数组指向新数组
        */
        int[] arr = {11, 12, 20, 45};

        //先定位
        Scanner sc = new Scanner(System.in);
        System.out.print("输入要插入的数：");
        int insertNum = sc.nextInt(); //要添加的数
        int index = -1; //要插入的位置下标
        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) { //如果要插入的数小于arr[i]，那么i就是要插入的位置
                index = i;
                break;
            }
        }
        if (index == -1) { //遍历一遍没有找到合适的位置，即要插入的数是最大的，那么i就是数组的长度
            index = arr.length;
        }
        //System.out.println(index);

        System.out.println("====原数组====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //扩容
        int[] arrNew = new int[arr.length + 1];
        //将arr的元素拷贝到arrNew中，跳过index这个位置
        //i控制的是arrNew下标，j是控制arr下标
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != index) { //说明可以把arr拷贝到arrNew
                arrNew[i] = arr[j];
                j++;
            } else { //i这个位置就是要插入的数
                arrNew[i] = insertNum;
            }
        }

        //把arr指向arrNew
        arr = arrNew;
        //输出arr
        System.out.println("\n====添加元素后arr====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }


    }
}
