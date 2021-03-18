package com.zqs.dayhomework.day11_object;

/**
 * @description: 第一题
 * @author: z_qingshan
 * @create: 2021-03-12
 **/

/**
 * 写一个计算接口,然后使用匿名内部类去实现加减乘除并测试
 */
public class Test01 {
    public static void main(String[] args) {
        //加法
        Calculation add = new Calculation() {
            @Override
            public void test(int a, int b) {
                System.out.println("=====加法测试=====");
                System.out.println(a + " + " + b + " = " + (a + b));
            }
        };
        add.test(5, 4);

        //减法
        Calculation sub = new Calculation() {
            @Override
            public void test(int a, int b) {
                System.out.println("=====减法测试=====");
                System.out.println(a + " - " + b + " = " + (a - b));
            }
        };
        sub.test(90, 10);

        //乘法
        new Calculation() {
            @Override
            public void test(int a, int b) {
                System.out.println("=====乘法测试=====");
                System.out.println(a + " * " + b + " = " + (a * b));
            }
        }.test(7, 7);

        //除法
        new Calculation() {
            @Override
            public void test(int a, int b) {
                System.out.println("=====除法测试=====");
                System.out.println(a + " / " + b + " = " + ((double) a / (double) b));
            }
        }.test(15, 6);
    }
}

interface Calculation {
    void test(int a, int b);
}