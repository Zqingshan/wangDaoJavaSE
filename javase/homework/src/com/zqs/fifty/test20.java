package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test20 {
    public static void main(String[] args) {
        //题目：输入某年某月某日，判断这一天是这一年的第几天？
        // 程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，
        // 闰年且输入月份大于3时需考虑多加一天。

        Scanner sc = new Scanner(System.in);
        int year, month, day; //年，月，日
        int monthDay = 0; //当月的天数
        int sumOfDay = 0; //多个月份的天数总和
        boolean flag = true; //循环继续或者终止条件
        //先判断输入的年月日是否正确
        do {
            flag = false;
            System.out.print("输入年份：");
            year = sc.nextInt();
            System.out.print("输入月份：");
            month = sc.nextInt();
            System.out.print("输入日期：");
            day = sc.nextInt();
            if (year <= 0 || month <= 0 || month > 12 || day > 31 || day <= 0) {
                System.out.println("你输入的信息有误，请重新输入！");
                System.out.println();
                flag = true;
            }
        } while (flag);

        //计算输入月份的天数，i不能等于month，比如输入3月是计算1月+2月+3月的日期天数总和
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    monthDay = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    monthDay = 30;
                    break;
                case 2:
                    //判断是不是闰年
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        monthDay = 29;
                    } else {
                        monthDay = 28;
                    }
                    break;
            }
            sumOfDay += monthDay; //计算输入的月份天数总和
        }
        System.out.println(year + "-" + month + "-" + day + "是这年的第" + (sumOfDay + day) + "天");
        System.out.println();
        sc.close();
    }
}
