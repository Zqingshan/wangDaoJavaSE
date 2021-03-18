package com.zqs.fifty;


import java.util.Arrays;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test29 {
    public static void main(String[] args) {
        //29 打印杨辉三角

        //打印杨辉三角
        /*
              1
             1 1
            1 2 1
           1 3 3 1
          1 4 6 4 1
        1 5 10 10 5 1

        规律：
        1、第一行有1个元素，第n行有n个元素
        2、每一行第一个元素和最后一个元素都是1
        3、从第三行开始，中间的元素为arr[i][j]=arr[i-1][j]+arr[i-1][j-1]
        */

        int[][] arr = new int[5][];
        //遍历杨辉中的每个元素
        for (int i = 0; i < arr.length; i++) {

            //给每个一维数组分配内存空间
            arr[i] = new int[i + 1];
            //赋值
            for (int j = 0; j < arr[i].length; j++) {
                //每一行的第一个元素和最后一个元素都是1
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else { //中间的元素
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        //输出杨辉三角
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
