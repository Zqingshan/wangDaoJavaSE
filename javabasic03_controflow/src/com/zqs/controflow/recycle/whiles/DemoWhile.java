package com.zqs.controflow.recycle.whiles;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-01-28
 */
public class DemoWhile {
    public static void main(String[] args) {

        //求1-100的和
        int i = 1,sum = 0;
        while (i <= 100){
            sum += i;
            i++;
        }
        //System.out.println("1-100的和为：" + sum);

        //我国最高山峰珠穆朗玛峰是8848m，我现在有一张足够大的纸，厚度为0.01m
        //请问，我折叠多少次，就可以保证厚度不低于珠峰的高度
        double height = 0.01; //初始化语句，纸张的初始化高度
        int count = 0; //计数值
        while (height < 8848){
            count++;
            height *= 2;
        }
        System.out.println("折叠的次数是：" + count + "-------高度是：" + height);
    }
}
