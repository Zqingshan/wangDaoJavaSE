package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test18 {
    public static void main(String[] args) {
        //一个数如果恰好等于它的所有因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
        int count = 0; // 计数
        for (int i = 1; i < 1000; i++) {
            int num = 0; //因子之和
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    num += j;
                }
            }
            if (i == num) { //i等于因子之和num，即i是完数
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.println("\n1000以内有" + count + "个完数");
    }
}
