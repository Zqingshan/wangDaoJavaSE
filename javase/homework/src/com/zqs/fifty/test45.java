package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test45 {
    public static long fn(int n) {
        long result = 0;
        if (n == 1 || n == 0) {
            result = 1;
        } else if (n > 1) {
            result = n * fn(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        //45 利用递归方法求5!。
        //程序分析：递归公式：fn=fn-1*4!
        System.out.println("5的阶乘为" + fn(5));

    }
}
