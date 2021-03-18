package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test21 {
    public static void main(String[] args) {
        //21题 一个整数，它加上100后是一个完全平方数，再加上268又是一个完全平方数，请问该数是多少？
        //程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。

        for (int i = 0; i <= 100000; i++) {
            int x = (int)Math.sqrt(i + 100); //先将该数加100再开方
            int y = (int)Math.sqrt(i + 268); //再将该数加268再开方
            if (x * x == i + 100 && y * y == i + 268) {
                System.out.print(i + "\t");
            }
        }
    }
}
