package com.zqs.dayhomework.day04_array2;

/**
 * @description: 某公司该年度，每个季度的销售额（单位：万元）如下：
 * 第一季度：30,66, 44
 * 第二季度：10, 33, 20
 * 第三季度: 10,99,88
 * 第四季度: 9,18,25
 * 求：每个季度平均销售额 年度销售总额
 * @author: z_qingshan
 * @create: 2021-03-04
 **/
public class test02 {
    public static void main(String[] args) {
        int[][] sales = {{30, 66, 44}, {10, 33, 20}, {10, 99, 88}, {9, 18, 25}};
        quartAvgSales(sales);
        yearSales(sales);
    }

    //季度平均销售额
    public static void quartAvgSales(int[][] sales) {
        for (int i = 0; i < sales.length; i++) {
            int sum = 0;
            for (int j = 0; j < sales[i].length; j++) {
                sum += sales[i][j];
            }
            System.out.println("第" + (i + 1) + "季度平均销售额=" + (sum / 3.0));
        }
    }

    //年度销售总额
    public static void yearSales(int[][] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                sum += sales[i][j];
            }
        }
        System.out.println("年度销售总额是：" + sum);
    }
}
