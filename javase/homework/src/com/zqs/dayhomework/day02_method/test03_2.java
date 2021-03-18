package com.zqs.dayhomework.day02_method;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-03-02
 */
public class test03_2 {
    //编程实现已知某人的工资(要求输入)，求他应该缴纳的个人所得税以及最后得到的工资。
    //新建方法
    public static double salary(double salary) {
        double taxable = 0;//应纳税所得额
        double salaryLeft = 0;//到手工资
        double tax = 0;//应纳税额
        if (salary <= 2000) {
            System.out.println("不用缴税，到手工资为：" + salary);
        } else {
            taxable = salary - 2000;
            double taxRate = 0;//税率
            double deduction = 0;//速算扣除数
            if (taxable < 500 | taxable == 500) {
                taxRate = 0.05;
                deduction = 0;
            } else if (taxable > 500 && (taxable < 2000 | taxable == 2000)) {
                taxRate = 0.1;
                deduction = 25;
            } else if (taxable > 2000 && (taxable < 5000 | taxable == 5000)) {
                taxRate = 0.15;
                deduction = 125;
            } else if (taxable > 5000 && (taxable < 20000 | taxable == 20000)) {
                taxRate = 0.2;
                deduction = 375;
            } else if (taxable > 20000 && (taxable < 40000 | taxable == 40000)) {
                taxRate = 0.25;
                deduction = 1375;
            } else if (taxable > 40000 && (taxable < 60000 | taxable == 60000)) {
                taxRate = 0.3;
                deduction = 3375;
            } else if (taxable > 60000 && (taxable < 80000 | taxable == 80000)) {
                taxRate = 0.35;
                deduction = 6375;
            } else if (taxable > 80000 && (taxable < 100000 | taxable == 100000)) {
                taxRate = 0.4;
                deduction = 10375;
            } else if (taxable > 100000) {
                taxRate = 0.45;
                deduction = 15375;
            }

            tax = taxable * taxRate - deduction; //缴纳的个人所得税
            salaryLeft = salary - tax; //实际到手工资
        }
        return salaryLeft;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入工资：");
        double sal = sc.nextDouble();
        System.out.println("最后的工资为：" + salary(sal));

        sc.close();
    }
}
