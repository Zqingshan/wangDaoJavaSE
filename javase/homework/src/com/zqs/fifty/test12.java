package com.zqs.fifty;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test12 {
    public static void main(String[] args) {
        //利用switch语句，实现对学生分数评级的功能。程序的输入是一个int类型的变量score，代表学生的分数取值范围[0,100]
        /*当分数范围为0=<score<60    输出不及格
        当分数范围为60=<score<70   输出及格
        当分数范围为70=<score<80   输出中
        当分数范围为80=<score<90   输出良
        当分数范围为90=<score<=100 输出优
        提示：可合理利用case穿越*/
        do {
            System.out.print("输入学生的成绩：");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            switch (score / 10) {  //取成绩的十位以及百位
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    //0-60分区间
                    System.out.println("不及格");
                    break;
                case 6:
                    //60-70区间
                    System.out.println("及格");
                    break;
                case 7:
                    //70-80区间
                    System.out.println("中");
                    break;
                case 8:
                    //80-90区间
                    System.out.println("良");
                    break;
                case 9:
                case 10:
                    //90-100区间
                    System.out.println("优");
                    break;
                default:
                    System.out.println("输入的成绩有误，请重新输入");
                    break;
            }
        }while (true);
    }
}
