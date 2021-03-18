package com.zqs.other;

import java.util.Scanner;

/**
 * @description: 管理员类
 * @author: z_qingshan
 * @create: 2021-03-10
 **/
public class Administrator {
    private Student[] s = new Student[100];
    private Scanner sc = new Scanner(System.in);
    private int arrEnd = 2;

    {
        s[0] = new Student(1, "王大力", "男", 16, "一年一班", "123456789");
        s[1] = new Student(2, "诸葛铁柱", "男", 16, "一年一班", "987654321");
        s[2] = new Student(3, "阿巴阿巴", "男", 16, "一年一班", "110");
    }

    public void stuList() {
        for (int i = 0; i <= arrEnd; i++) {
            s[i].getInfo();
        }
    }

    public void stuAdd() {
        arrEnd++;
        s[arrEnd] = Scannertool.setStuInfo();
        stuList();
    }

    public int stuSearch(String name) {
        for (int i = 0; i <= arrEnd; i++) {
            String tempname = s[i].getName();
            if (tempname.equals(name)) {
                s[i].getInfo();
                return i;
            }
        }
        System.out.println("没有这个学生");
        return -1;
    }

    public void stuDelete(String name) {
        System.out.println("删除目标为：");
        int mark = stuSearch(name);
        if (mark == -1) {
            System.out.println("没有这个学生，无法删除");
        } else {
            for (int i = mark; i < arrEnd; i++) {
                s[i] = s[i + 1];
            }
            arrEnd--;
        }
        System.out.println("此时的列表：");
        stuList();
    }

    public void stuChange(String name) {
        System.out.println("修改的目标学生为");
        int mark = stuSearch(name);
        if (mark == -1) {
            System.out.println("没有这个学生，无法修改");
        } else {
            s[mark] = Scannertool.setStuInfo();
        }
        System.out.println("此时的列表：");
        stuList();


    }
}
