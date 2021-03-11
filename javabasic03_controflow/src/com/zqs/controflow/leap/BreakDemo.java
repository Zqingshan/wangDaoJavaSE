package com.zqs.controflow.leap;

import java.util.Random;
import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-02
 * <p>
 * <p>
 * 控制循环的关键字有两个：即break和continue。
 * 这两个关键字可以实现不同的效果，break是结束循环，也可以称为跳出循环；continue是直接执行下一次循环，也就是跳过本次循环。
 */
public class BreakDemo {
    public static void main(String[] args) {

        //不使用break
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + " -- " + "j = " + j);
            }
        }*/

        //System.out.println("------------------------");

        //使用break
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) { //j=2时结束内层循环
                    break;
                }
                System.out.println("i = " + i + " -- " + "j = " + j);
            }
        }*/

        //System.out.println("------------------------");

        //break结束内外层循环
        /*Loop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    break Loop;
                }
                System.out.println("i = " + i + " -- " + "j = " + j);
            }
        }*/

        //随机生成1-100的一个数，直到生成97这个数，看一共用来多少次
        //方法1
        /*int count = 0; //计数
        for (int i = 0; i <= 300; i++) {
            int ran = (int) (Math.random() * 100) + 1;
            System.out.print(ran + "\t");
            if (ran == 97) {
                break;
            }
            count++;
        }
        System.out.println("\n" + "生成97这个数，用了" + count + "次");

        System.out.println("----------------------------------");*/

        //方法2
        /*count = 0;
        Random random = new Random(1);
        for (int i = 0; i < 200; i++) {
            int num = random.nextInt(100);
            System.out.print(num + "\t");
            if (num == 97) {
                break;
            }
            count++;
        }*/

        //方法3 while循环
        /*int i = 0;
        while (i < 200) {
            int num = random.nextInt(100); //参数100是随机数的上限，0 <= num < 100
            System.out.print(num + "\t");
            if (num == 97) {
                break;
            }
            count++;
            i++;
        }
        System.out.println("\n" + "生成97这个数，用了" + count + "次");*/

        //1-100以内的数求和，求出 当和 第一次大于20的当前数
        //1.循环 1-100 ，求和 sum
        //2.当 sum > 20 时，记录下当前数，然后break
        /*int sum = 0;//求和
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println("和>20的时候，当前数i=" + i);
                break;
            }
        }*/

        //实现登录验证，有3次机会，如果用户名为“青山”，密码“666”提示登录成功，否则提示还有几次机会
        Scanner sc = new Scanner(System.in);
        int chance = 3; //登录一次，减少一次
        for (int i = 3; i >= 1; i--) {
            System.out.print("请输入用户名：");
            String name = sc.next();
            //System.out.println("你输入的用户名是" + name);
            System.out.print("请输入密码：");
            String pwd = sc.next();
            //System.out.println("你输入的密码是" + pwd);
            //判断用户名密码是否正确
            if ("青山".equals(name) && "666".equals(pwd)) {
                System.out.println("登录成功");
                break;
            }else{
                chance--;
                System.out.println("用户名错误，请重新输入，还有" + chance + "次机会");
            }
        }
        sc.close();
    }
}
