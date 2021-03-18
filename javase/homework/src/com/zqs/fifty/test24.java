package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test24 {
    public static void main(String[] args) {
        //24题 求1+2!+3!+...+20!的和
        long sum = 0;
        long n = 1;
        for (int i = 1; i <= 20; i++) {
            //方法1
            /*
            n *= i; //每一项的最后一个数都是i，i乘以上一项的乘积可得新的乘积
            sum += n;
            */

            //方法2
            n = 1;
            for (int j = 1; j <= i; j++) {
                n *= j; //从1开始累乘到j
            }
            sum += n;
        }
        System.out.println(sum);
    }
}
