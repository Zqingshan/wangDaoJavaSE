package com.zqs.dayhomework.day02_method;

/**
 * @author z_qingshan
 * @create 2021-03-02
 */
public class test06 {
    public static void main(String[] args) {
        //6，利用switch语句输出每个月份对应的季节，要合理使用case穿越
        //12,1,2 冬季   3,4,5 春季   6,7,8 夏季   9,10,11  秋季

        /*Scanner sc = new Scanner(System.in);
        System.out.print("输入月份：");
        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(month + "是冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + "是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + "是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + "是秋季");
                break;
            default:
                System.out.println("输入的月份有误，请重新输入");
                break;
        }*/

        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 12:
                case 1:
                case 2:
                    System.out.print(i + "月是冬季" + " ");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.print(i + "月是春季" + " ");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.print(i + "月是夏季" + " ");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.print(i + "月是秋季" + " ");
                    break;
            }
        }
    }
}
