package com.zqs.dayhomework.day01_basic;

import java.util.Scanner;

/**
 * @author z_qingshan
 * @create 2021-03-01
 */
public class test03 {
    public static void main(String[] args) {
        //第三题
        /*编程实现已知某人的工资(要求输入)，求他应该缴纳的个人所得税以及最后得到的工资。
        个人所得税计算方法计算方法 :
        应纳税所得额 =工资薪金所得-2000（即工资超过2000的部分才需要缴税）
        应纳税额 = 应纳税所得额 *税率-速算扣除数 （速算扣除额已经扣除了重复计算的部分）
        符合下列表格：
        级数          全月应纳税所得额                 税率（％）           速算扣除数

        1              不超过500元的                    5                      0

        2           超过500元至2000元的部分             10                     25

        3          超过2000元至5000元的部分             15                     125

        4          超过5000元至20000元的部分            20                    375

        5          超过20000元至40000元的部分           25                    1375

        6          超过40000元至60000元的部分           30                   3375

        7         超过60000元至80000元的部分            35                    6375

        8         超过80000元至100000元的部分           40                    10375

        9          超过100000元的部分                   45                   15375*/
        Scanner sc = new Scanner(System.in);
        double finalSalary; //最后工资
        double payable; //个人所得税
        System.out.print("输入工资：");
        double salary = sc.nextDouble();
        double inCome = 0;
        if (salary >= 2000) {
            inCome = salary - 2000; //应纳税所得额
        } else {
            System.out.println("工资少于2000，不用交税，所以工资为" + salary);
        }

        if (inCome < 500) {
            payable = inCome * 0.05; //应纳税额
            finalSalary = salary - payable; //最后工资
        } else if (inCome > 500 && inCome <= 2000) { //500-2000
            payable = inCome * 0.1 - 25;
            finalSalary = salary - payable;
        } else if (inCome > 2000 && inCome <= 5000) { //2000-5000
            payable = inCome * 0.15 - 125;
            finalSalary = salary - payable;
        } else if (inCome > 5000 && inCome <= 20000) { //5000-20000
            payable = inCome * 0.2 - 375;
            finalSalary = salary - payable;
        } else if (inCome > 20000 && inCome <= 40000) { //20000-40000
            payable = inCome * 0.25 - 1375;
            finalSalary = salary - payable;
        } else if (inCome > 40000 && inCome <= 60000) { //40000-60000
            payable = inCome * 0.3 - 3375;
            finalSalary = salary - payable;
        } else if (inCome > 60000 && inCome <= 80000) { //60000-80000
            payable = inCome * 0.35 - 6375;
            finalSalary = salary - payable;
        } else if (inCome > 80000 && inCome <= 100000) { //80000-100000
            payable = inCome * 0.4 - 10375;
            finalSalary = salary - payable;
        } else { // >100000
            payable = inCome * 0.45 - 15375;
            finalSalary = salary - payable;
        }
        System.out.println("应缴纳的个人所得税为" + payable + "，最后得到的工资为" + finalSalary);

        sc.close();
    }
}
