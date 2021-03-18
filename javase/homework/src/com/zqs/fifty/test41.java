package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test41 {
    public static void main(String[] args) {
        //41 一球从100米高度自由落下，每次落地后反跳回原高度的一半；求它在第10次落地时，共经过多少米？第10次反弹多高？

        double meter = 0; //经过路程
        double hight = 100; //高度
        for (int i = 1; i <= 10; i++) {
            meter += hight;
            hight /= 2;
            meter += hight;
        }
        System.out.println("经过" + meter + "米");
        System.out.println("第10次反弹" + hight + "米");
    }
}
