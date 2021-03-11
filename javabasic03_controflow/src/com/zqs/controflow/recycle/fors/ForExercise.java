package com.zqs.controflow.recycle.fors;


import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-02-03
 */
public class ForExercise {
    public static void main(String[] args) {
        //练习1 请输出一个4行5列的*图案
        //region Description
        /*for (int i = 0; i < 4; i++) { //重复输出4行

            //重复输出每一行的*
            for (int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");*/
        //endregion

        //练习2 输出以下图案
        /**
         *
         **
         ***
         ****
         *****
         */

        //输出5行
        //region Description
        /*for (int i = 1; i <= 5; i++) {

            //每一行i个*
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");*/
        //endregion

        //练习3  输出九九乘法表
        //region Description
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");*/
        //endregion

        //练习4 倒三角九九乘法表
        //region Description
        /*for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }*/
        //endregion

        //求1-100之间所有是9的倍数的整数，统计个数及总和
        //region Description
        /*int count = 0; //计数
        int sum = 0; //总和
        int start = 1;
        int end = 100;
        int div = 10; //倍数
        for (int i = start; i < end; i++) {
            if (i % div == 0) { //判断能否被9整除
                count++;
                sum += i;
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("个数有" + count + "个");
        System.out.println("总和是" + sum);*/
        //endregion

        //完成下面的表达式输出
        // 0 + 5 = 5
        // 1 + 4 = 5
        // 2 + 3 = 5
        // 3 + 2 = 5
        // 4 + 1 = 5
        // 5 + 0 = 5
        /*for (int i = 0, j = 5; i <= 5; i++, j--) {
            System.out.println(i + "+" + j + "=" + (i + j));
        }*/
        /*for (int i = 0; i <= 5; i++) {
            System.out.println(i + "+" + (5 - i) + "=5");
        }*/

        //统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分
        //统计三个班及格人数，每个班有5名同学
        //思路分析
        /*化繁为简
         *（1）先计算一个班，5个学生的成绩和平均分，使用for
         * 1.1 创建Scanner对象然后接收用户输入
         * 1.2 得到该班级的平均分，定义一个 int sum 把该班级5个学生的成绩累加
         *
         * （2）统计3个班（每个班5名学生）平均分
         * （3）所有班级的平均分
         * 3.1 定义一个变量，int totalScore 累加所有学生的成绩
         * 3.2 当多重循环结束后，totalScore / 15
         * （4）统计三个班级及格人数
         * 4.1 定义变量 int count ，当有一个学生的成绩>=60时，count++
         *
         */
        //region Description
        /*Scanner sc = new Scanner(System.in);
        int totalScore = 0; //所有学生成绩
        int count = 0; //统计及格人数
        for (int i = 1; i <= 3; i++) { //3个班级

            int sum = 0; //一个班级的总分
            for (int j = 1; j <= 5; j++) { //5名同学
                System.out.print("请输入第" + i + "个班级" + "第" + j + "名同学的成绩：");
                int score = sc.nextInt();
                //当有一个学生成绩 >= 60，count++
                if (score >= 60) {
                    count++;
                }
                sum += score; //一个班级学生成绩累加
                System.out.println("成绩为" + score);
            }
            System.out.println("第" + i + "个班级的总分是" + sum + "\n" + "平均分是" + sum / 5 + "\n");
            totalScore += sum; //所有学生成绩累加
        }
        System.out.println("所有班级总分是" + totalScore + "\t" + "平均分是" + totalScore / 15 + "\t"
                + "及格人数是" + count);

        sc.close();*/
        //endregion

        //打印空心金字塔
        //region 空心金字塔
        //思路分析
        /*
        化繁为简
        1、先打印一个矩形
        *****
        *****
        *****
        *****
        *****
        for(int i = 1; i <= 5; i++){ //i表示层数
            //打印每层的*
            System.out.println("*****");
        }

        2、打印半个金字塔
        *         //第1层 有 1个*
        **        //第2层 有 2个*
        ***       //第3层 有 3个*
        ****      //第4层 有 4个*
        ******    //第5层 有 5个*
        for(int i = 1; i <= 5; i++){ //i表示层数
            //打印每层的*
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        3、打印整个金字塔
            *          //第1层 有 1个*    有2 * 当前层数(1) - 1 个*   有4=（总层数 - 当前层数） 个空格
           ***         //第2层 有 3个*    有2 * 当前层数(2) - 1 个*   有3=（总层数 - 当前层数） 个空格
          *****        //第3层 有 5个*    有2 * 当前层数(3) - 1 个*   有2=（总层数 - 当前层数） 个空格
         *******       //第4层 有 7个*    有2 * 当前层数(4) - 1 个*   有1=（总层数 - 当前层数） 个空格
        *********      //第5层 有 9个*    有2 * 当前层数(5) - 1 个*   有0=（总层数 - 当前层数） 个空格
        for (int i = 1; i <= 5; i++) { //控制行
            //打印空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        4、打印空心金字塔
            *          //第1层 有 1个*    输出的当前行的第一个位置的*和最后一个位置的*
           * *         //第2层 有 2个*    输出的当前行的第一个位置的*和最后一个位置的*
          *   *        //第3层 有 2个*    输出的当前行的第一个位置的*和最后一个位置的*
         *     *       //第4层 有 2个*    输出的当前行的第一个位置的*和最后一个位置的*
        *********      //第5层 有 9个*    全部输出*
        for (int i = 1; i <= 5; i++) { //控制行

            //打印空格，对应空格 = 总层数 - 当前层
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            //打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                //当前行的第一个位置是*，最后一个位置也是*，最后一行全部是*
                if (k == 1 || k == 2 * i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        先死后活
        层数做成变量 int totalLevel = 5;

         */

        /*int totalLevel = 10;
        for (int i = 1; i <= totalLevel; i++) { //控制行

            //打印空格，对应空格 = 总层数 - 当前层
            for (int j = 1; j <= totalLevel - i; j++) {
                System.out.print(" ");
            }

            //打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                //当前行的第一个位置是*，最后一个位置也是*，最后一行全部是*
                if (k == 1 || k == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        //endregion

        //打印空心矩形
        //region 空心矩形
        /*
         **********
         *        *
         *        *
         **********
         */
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                //打印第一行和最后一行*，第一列和最后一行也打印*
                if (i == 1 || i == 4 || j == 1 || j == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        //endregion

        //打印实体菱形
        //先打印上半部分
        /*for (int i = 1; i <= 4; i++) {
            //打印空格
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            //打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印下半部分
        for (int i = 3; i >= 1; i--) {
            //打印空格
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            //打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------");*/

        //打印空心菱形
        /*
              *          //3个空格     1个*
             * *         //2个空格     2个*
            *   *        //1个空格     2个*
           *     *       //0个空格     2个*
            *   *        //1个空格     2个*
             * *         //2个空格     2个*
              *          //3个空格     1个*
         */
        //打印上半部分
        /*for (int i = 1; i <= 4; i++) {
            //打印空格
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            //打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //打印下半部分
        for (int i = 3; i >= 1; i--) {
            //打印空格
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            //打印*
            for (int k = 1; k <= 2 * i - 1; k++) {
                //第一列和最后一列打印*
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //出票系统：根据淡旺季的月份和年龄，打印票价
        /*
        4-10旺季：
            成人（18-60）：60
            儿童（<18）：半价
            老人（>60）：1/3
        淡季：
            成人：40
            其他：20
        */
        Scanner sc = new Scanner(System.in);
        int month;
        int age;
        System.out.print("输入月份：");
        month = sc.nextInt();
        System.out.print("输入年龄：");
        age = sc.nextInt();
        //判断月份是旺季还是淡季
        if (month >= 4 && month <= 10) {
            System.out.println(month + "月份是旺季");
            //根据年龄输出票价
            if (age > 18 && age <=60) {
                //成人票价
                System.out.println("成人票价是60元/张");
            }else if(age > 60){
                //老人票价
                System.out.println("老人票价是20元/张");
            }else{
                //儿童票价
                System.out.println("儿童票价是30元/张");
            }
        }else {
            System.out.println(month + "月份是淡季");
            if (age > 18 && age <=60) {
                //成人票价
                System.out.println("成人票价是40元/张");
            }else {
                //老人儿童票价
                System.out.println("老人以及儿童票价是20元/张");
            }
        }

        sc.close();
    }
}
