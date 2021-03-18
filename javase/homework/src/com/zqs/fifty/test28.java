package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test28 {
    public static void main(String[] args) {
        //28 对10个数进行排序
        //使用选择排序
        int[] arr = new int[10];
        int temp;

        //10个随机数赋值
        System.out.println("====数组未排序前====");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);

            //遍历一维数组
            System.out.print(arr[i] + "\t");
        }

        //选择排序
        //排序轮次
        for (int i = 0; i < arr.length - 1; i++) {
            //每轮排序的次数
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) { //如果后一个元素比前一个元素小则交换
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n====数组排序后====");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
