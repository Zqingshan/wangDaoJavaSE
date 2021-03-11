package com.zqs.controflow.leap;

/**
 * @author z_qingshan
 * @create 2021-02-02
 */
public class ReturnDemo {
    public static void main(String[] args) {

        //不使用return
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println("i = " + i + " -- " + "j = " + j);
            }
        }

        System.out.println("-------------------");

        //使用return
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                if(j == 2) {
                    return;
                }
                System.out.println("i = " + i + " -- " + "j = " + j);
            }
        }
    }
}
