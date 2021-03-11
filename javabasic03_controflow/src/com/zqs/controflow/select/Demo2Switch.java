package com.zqs.controflow.select;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-01-26 0:00
 */
public class Demo2Switch {
    public static void main(String[] args) {

        //1、模拟单项选择题，根据你的选择，给出相应的答案
        /*System.out.println("你想买什么车？");
        System.out.println("A.兰博基尼");
        System.out.println("B.阿斯顿马丁");
        System.out.println("C.宝马");
        System.out.println("D.领克");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = s.charAt(0); //读取字符串的第一个字符

        switch (c){
            case 'A':
                System.out.println("你想买的车是兰博基尼");
                break;
            case 'B':
                System.out.println("你想买的车是阿斯顿马丁");
                break;
            case 'C':
                System.out.println("你想买的车是宝马");
                break;
            case 'D':
                System.out.println("你想买的车是领克");
                break;
            default:
                System.out.println("你想买的车不在选项内，请重新选择");

        }*/

        //2、键盘录入字符串，根据给定的字符串，来输出你选择的字符串是什么?(表达式是字符串的情况)
        /*System.out.println("输入姓氏，得出全名：");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        switch (s){
            case "赵":
                System.out.println("你的全名是赵某某");
                break;
            case "袁":
                System.out.println("你的全名是袁某某");
                break;
            case "诸葛":
                System.out.println("你的全名是诸葛村夫");
                break;
            case "欧阳":
                System.out.println("你的全名是欧阳疯");
                break;
             default:
                 System.out.println("识别不出，请重新输入姓氏");
        }*/

        //3、用switch语句实现键盘录入月份，输出对应的季节，合理利用case穿越
        /*System.out.println("输入月份：");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
             default:
                 System.out.println("输入的月份有误，请重新输入");
        }*/

        //4、看代码写结果
        //版本1
        /*int x = 2;
        int y = 3;
        switch(x){
            default:
                y++;
                break;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y=" + y);*/
        //版本2
        int x = 2;
        int y = 3;
        switch(x){
            default:
                y++;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y=" + y);



        //sc.close();
    }
}
