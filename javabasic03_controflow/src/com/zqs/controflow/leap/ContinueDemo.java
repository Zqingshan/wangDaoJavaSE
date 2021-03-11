package com.zqs.controflow.leap;

/**
 * @author z_qingshan
 * @create 2021-02-02
 */
public class ContinueDemo {
    public static void main(String[] args) {

        //当i=5时，continue终止本次循环，继续下一个
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------------");

        //不使用continue
        System.out.println("不使用continue");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + " -- " + "j = " + j);
            }
        }

        System.out.println("--------------------");

        //使用continue
        System.out.println("j=1时使用continue");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue;
                }
                System.out.println("i = " + i + " -- " + "j = " + j);
            }
        }

        System.out.println("--------------------");

        //使用标签跳过外层循环
        System.out.println("使用标签");
        Loop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue Loop;
                }
                System.out.println("i = " + i + " -- " + "j = " + j);
            }
        }

        System.out.println("--------------------");

        int i = 1;
        while (i <= 4) {
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println("i=" + i);
        }
    }
}
