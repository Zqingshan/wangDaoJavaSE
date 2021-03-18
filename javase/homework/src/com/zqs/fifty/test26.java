package com.zqs.fifty;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test26 {
    public static void main(String[] args) {
        //26题 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
        /*
        星期一至星期日英文：
        Monday，Tuesday、Wednesday、Thursday、Friday、Saturday 、Sunday
        */
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("输入星期的第一个字母：");
            String input = sc.next();
            switch (input) {
                case "M":
                case "m":
                    System.out.println("Monday星期一");
                    break;
                case "T":
                case "t":
                    //星期二和星期四都是T开头
                    System.out.print("再输入一个字母：");
                    input = sc.next();
                    if ("u".equals(input)) {
                        System.out.println("Tuesday星期二");
                    } else if ("h".equals(input)) {
                        System.out.println("Thursday星期四");
                    } else {
                        System.out.println("输入有误，请重新输入");
                    }
                    break;
                case "W":
                case "w":
                    System.out.println("Wednesday星期三");
                    break;
                case "F":
                case "f":
                    System.out.println("Friday星期五");
                    break;
                case "S":
                case "s":
                    System.out.print("再输入一个字母：");
                    input = sc.next();
                    if ("a".equals(input)) {
                        System.out.println("Saturday星期六");
                    } else if ("u".equals(input)) {
                        System.out.println("Sunday星期日");
                    } else {
                        System.out.println("输入有误，请重新输入");
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        } while (true);
        //sc.close();
    }
}
