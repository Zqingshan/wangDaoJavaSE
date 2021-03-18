package com.zqs.fifty;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test08 {
    public static void main(String[] args) {
        //有三个int变量，a,b,c假设三个变量中有两个变量的值相同，
        // 请问如何快速求出，哪个和其他两个变量不同的第三个变量的值？
        int a = 1;
        int b = 2;
        int c = 1;
        int result = (a == b) ? c : a == c ? b : a;
        System.out.println("在" + a + ","  + b + ","  + c + "三个变量中，与其他两个变量不同的值为" + result);
    }
}
