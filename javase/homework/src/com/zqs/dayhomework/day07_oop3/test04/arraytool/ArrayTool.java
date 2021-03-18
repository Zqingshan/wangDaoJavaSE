package com.zqs.dayhomework.day07_oop3.test04.arraytool;

/**
 * @description: 数组的工具类
 * @author: z_qingshan
 * @create: 2021-03-06
 **/
public class ArrayTool {
    private ArrayTool() {
    }

    //遍历整型数组

    /**
     * 参数，整型数组
     *
     * @param arr
     */
    public static void traverse(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //最后一个元素不应该加逗号
            //需要用if判断这个元素是否是最后一个元素
            if (i == arr.length - 1) {
                //这个i是数组最大的下标 代表最后一个元素
                System.out.println(arr[i] + "]");
            } else {
                //该元素不是最后一个元素 需要加逗号
                System.out.print(arr[i] + ", ");
            }
        }
    }

    //遍历浮点型数组

    /**
     * 参数，浮点型数组
     *
     * @param arr
     */
    public static void traverse(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //最后一个元素不应该加逗号
            //需要用if判断这个元素是否是最后一个元素
            if (i == arr.length - 1) {
                //这个i是数组最大的下标 代表最后一个元素
                System.out.println(arr[i] + "]");
            } else {
                //该元素不是最后一个元素 需要加逗号
                System.out.print(arr[i] + ", ");
            }
        }
    }

    //整型数组求最大值

    /**
     * 参数，整型数组
     *
     * @param arr
     * @return
     */
    public static int getMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //浮点型数组求最大值

    /**
     * 参数，浮点型数组
     *
     * @param arr
     * @return
     */
    public static double getMaxNumber(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //整型数组求最小值

    /**
     * 参数，整型数组
     *
     * @param arr
     * @return
     */
    public static int getMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //浮点型数组求最小值

    /**
     * 参数，浮点型数组
     *
     * @param arr
     * @return
     */
    public static double getMinNumber(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //逆置整型数组元素

    /**
     * 参数，整型数组
     *
     * @param arr
     */
    public static void invertedArray(int[] arr) {
        int temp = 0; //临时变量
        int len = arr.length; //计算数组的长度
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        ArrayTool.traverse(arr);
    }

    //逆置浮点型数组元素

    /**
     * 参数，浮点型数组
     *
     * @param arr
     */
    public static void invertedArray(double[] arr) {
        double temp = 0; //临时变量
        int len = arr.length; //计算数组的长度
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        ArrayTool.traverse(arr);
    }

    //查表在数组中查找指定元素，若不存在，
    // 待查找元素返回-1，若存在返回元素在数组中首次出现的位置

    /**
     * 整型数组查找元素第一次出现的位置
     *
     * @param arr
     * @param num
     */
    public static int seqSearchFirst(int[] arr, int num) {
        //开始查找
        int startIndex = -1; //判断没有找到的条件
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        //要查找的数不在数组中
        return startIndex;
    }

    /**
     * 整型数组查找元素最后一次出现的位置
     *
     * @param arr
     * @param num
     */
    public static int seqSearchEnd(int[] arr, int num) {
        //开始查找
        int endIndex = -1; //判断没有找到的条件
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                endIndex = i;
            }
        }
        //要查找的数不在数组中
        return endIndex;
    }

    /**
     * 浮点型数组查找
     *
     * @param arr
     * @param num
     */
    public static double seqSearchFirst(double[] arr, double num) {
        //开始查找
        int startIndex = -1; //判断没有找到的条件
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        //要查找的数不在数组中
        return startIndex;
    }

    /**
     * 浮点型数组查找元素最后一次出现的位置
     *
     * @param arr
     * @param num
     * @return
     */
    public static double seqSearchEnd(double[] arr, double num) {
        //开始查找
        int endIndex = -1; //判断没有找到的条件
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                endIndex = i;
            }
        }
        //要查找的数不在数组中
        return endIndex;
    }


}
