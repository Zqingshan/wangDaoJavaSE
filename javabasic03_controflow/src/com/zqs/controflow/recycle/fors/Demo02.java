package com.zqs.controflow.recycle.fors;

/**
 * @author z_qingshan
 * @create 2021-03-02
 */
public class Demo02 {
    public static void main(String[] args) {
        //珠峰的高度是8848m，假设有一张足够大可折叠的纸张，初始厚度是0.01m，
        // 求解这张纸折叠多少次，纸张的厚度开始超过珠峰？
       /* double height = 0.01;
        int count = 0;
        while (height < 8848) {
            count++;
            height *= 2;
        }
        System.out.println("需要折叠" + count + "次，纸张的厚度才超过珠峰");*/

        /*int a;
        int b = 10;
        if (b > 5) {
            a = 10;
        } else {
            a = 20;
        }
        System.out.println(a);*/

        /**
         * 对于上述补全代码，我想实现
         *
         * - 控制台输出2次，"我热爱学习Java"  --> break
         * - 控制台输出7次，"我热爱学习Java"  --> continue
         * - 控制台输出13次，我热爱Java       --> 两次输出
         */
        /*for (int x = 1; x <= 10; x++) {
            if (x % 3 == 0) {
                //在此处填写代码
                System.out.println("我热爱学习Java");
            }
            System.out.println("我热爱学习Java");
        }*/

        //在填入的位置分别填入break，continue，return
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("我喜欢学习Java!");
                //填入
                continue;
            }
            System.out.println(i);
        }
        System.out.println("我喜欢学习C++!");
    }
}
