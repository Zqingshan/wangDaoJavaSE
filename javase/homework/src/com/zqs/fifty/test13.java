package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test13 {
    public static void main(String[] args) {
        //求水仙花数
        //题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
        //153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
        //程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
        for (int i = 100; i < 1000; i++) {
            //取出这个数的个位
            int unit = i % 10;
            //十位
            int decade = i / 10 % 10;
            //百位
            int hundred = i / 100;
            //判断是否符合
            if (unit * unit * unit + decade * decade * decade + hundred * hundred * hundred == i) {
                System.out.println(i);
            }
        }
    }
}
