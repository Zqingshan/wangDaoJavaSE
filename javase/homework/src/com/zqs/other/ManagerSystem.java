package com.zqs.other;

import java.util.Scanner;

/**
 * @description:
 * @author: z_qingshan
 * @create: 2021-03-10
 **/
public class ManagerSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Administrator a = new Administrator();

        outloopmark:
        while (true) {
            menuShow();
            String tempStringFunctionNum = sc.nextLine();
            int functionNum = Integer.parseInt(tempStringFunctionNum);


            switch (functionNum) {
                case 1:
                    a.stuList();
                    break;
                case 2:
                    a.stuAdd();
                    break;
                case 3:
                    a.stuDelete(sc.nextLine());
                    break;
                case 4:
                    a.stuChange(sc.nextLine());
                    break;
                case 5:
                    a.stuSearch(sc.nextLine());
                    break;
                case 6:
                    System.out.println("真的要退出吗？(Y/N)");
                    Scanner tempSc = new Scanner(System.in);
                    String judge = tempSc.nextLine();
                    if (judge.equals("Y")) {
                        System.out.println("感谢使用");
                        break outloopmark;
                    } else if (judge.equals("N")) {
                        break;
                    } else {
                        System.out.println("请输入正确字母");
                        break;
                    }
                default:
                    System.out.println("请输入正确数字");

            }

        }
    }
    private static void menuShow()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.print('-');
        }
        System.out.print("王道学生管理系统");
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.print('-');
        }
        System.out.println(' '); //第一行
        System.out.printf("%11d%s",1,".学生列表\n");
        System.out.printf("%11d%s",2,".增加学生\n");
        System.out.printf("%11d%s",3,".删除学生\n");
        System.out.printf("%11d%s",4,".修改学生\n");
        System.out.printf("%11d%s",5,".查询学生\n");
        System.out.printf("%11d%s",6,".退出系统\n");
        System.out.print("请选择功能（1-6）：");
    }
}
