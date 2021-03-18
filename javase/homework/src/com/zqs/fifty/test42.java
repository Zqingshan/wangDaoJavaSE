package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test42 {
    //斐波那契数列
    public static int f(int n) {
        int t1, t2;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            t1 = f(n - 1);
            t2 = f(n - 2);
            return t1 + t2;
        }
    }

    public static void main(String[] args) {
        //42 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
        // 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
        // 程序分析：兔子的规律为数列1,1,2,3,5,8,13,21....

        for (int i = 1; i <= 20; i++) {
            System.out.println("第" + i + "个月有" + f(i) + "对兔子");
        }
    }
}
