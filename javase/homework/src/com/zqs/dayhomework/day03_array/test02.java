package com.zqs.dayhomework.day03_array;

/**
 * @description: 把一个数组中的某个元素全部去掉，并统计有几个该元素
 * 注意这里指的是完全删除数组元素，而不是用0，null之类的默认值取代
 * 思考：能不能直接在原先数组中操作
 * @author: z_qingshan
 * @create: 2021-03-03
 **/
public class test02 {
    public static void main(String[] args) {

        //定义数组
        int[] arr = new int[]{1, 2, 3, 4, 4, 4, 6, 7, 9, 8};

        int count = 0; //计数

        //假设要去掉4这个元素
        System.out.println("-----原来数组-----");
        for (int i = 0; i < arr.length; i++) {
            //统计出有几个相同的元素
            if (arr[i] == 4) {
                count++;
            }
            System.out.print(arr[i] + " ");
        }
        //System.out.println("\n相同元素有" + count + "个");

        //创建一个新数组 数组长度为上一个数组长度减去相同元素的个数
        int[] arrNew = new int[arr.length - count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            //将原来数组的元素拷贝进新数组，跳过相同元素
            if (arr[i] != 4) {
                arrNew[j] = arr[i];
                j++;
            }
        }

        //将arr指向arrNew数组
        arr = arrNew;

        //System.out.println("去掉相同元素后的数组");
        System.out.println("\n-----处理后的数组-----");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n相同元素有" + count + "个");
    }
}
