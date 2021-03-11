package com.zqs.controflow.leap;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPNE;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-14
 */
public class Practice {
    public static void main(String[] args) {
        //某人有100,000元，每经过一次路口，需要缴费，规则如下：
        //（1）当现金>50000时，每次交5%
        //（2）当现金<=50000时，每次交1000
        //计算该人可以经过多少次路口，要求：使用while + break方式完成

        /*double money = 100000;//现有金额
        int times = 0;//经过路口的次数
        while (true) {
            if (money > 50000) {
                money *= 0.95; //缴费之后所剩金额
                times++;
            } else if (money >= 1000) {
                money -= 1000;
                times++;
            } else { //钱小于1000
                break;
            }
        }
        System.out.println("1000000可以经过" + times + "次路口");*/

        //输出1-100之间的不能被5整除的数，每一行5个
        /*int count = 0; //控制每行的个数
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                count++;
                System.out.print(i + "\t");
                if (count % 5 == 0){ //每输出5个数就换行
                    System.out.println();
                }
            }
        }*/

        //输出小写的a-z以及大写的Z-A
        /*System.out.println("小写字母：");
         *//*for (int i = 97; i <= 122; i++) {
            System.out.print((char)i + "\t");
        }*//*
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        System.out.println("大写字母：");
        *//*for (int i = 90; i >= 65; i--) {
            System.out.print((char)i + "\t");
        }*//*
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + "\t");
        }*/

        //求1-1/2+1/3-1/4...1/100的和
        /*
        思路分析
        1. 1-1/2+1/3-1/4...1/100 = （1/1）-（1/2）+（1/3）-（1/4）...1/100
        2. 可以看到
        （1）一共有100 个数，分子为1，分母从1-100
        （2）当分母为奇数时，前面是+，当分母为偶数时，前面是-
        3. 使用for+if
        4. 结果保存到sum中
        5. 这里有一个隐藏的陷阱，要把 公式分子 1 写成 1.0 才能得到精确的小数
         */
        /*double sum = 0;
        for (int i = 1; i <= 100; i++) {
            //判断是奇数还是偶数，然后做不同的处理
            if (i % 2 != 0) { //分母是奇数
                sum += 1.0 / i;
            } else { //分母是偶数
                sum -= 1.0 / i;
            }
        }
        System.out.println("结果是" + sum);*/

        //求1+（1+2）+（1+2+3）+（1+2+3+4）+...+（1+2+3+4+...+100）的结果
        //1 + 1+2 + 1+2+3 + 1+2+3+4
        int sum = 0;
        for (int i = 1; i <= 100; i++) { //i可以表示是第几项，同时也是当前项的最后一个数
            for (int j = 1; j <= i; j++) { //内层对1~i进行循环
                sum += j;
            }
        }
        System.out.println("结果是" + sum);


    }
}
