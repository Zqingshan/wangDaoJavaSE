package com.zqs.dayhomework.day14_exception;

/**
 * @description: 第四题
 * @author: z_qingshan
 * @create: 2021-03-16
 **/

import java.io.File;

/**
 * 自己找一个目录，里面放些一下文件，文件夹
 * 用带过滤器的listFiles方法进行筛选
 * 条件一：仅留下文件夹名包括a的文件夹
 * 条件二：仅留下.txt结尾的文本文件
 * 条件三：仅留下以a开头的文件
 */
public class Test04 {
    public static void main(String[] args) {
        File f = new File("G:\\新建文件夹");

        //仅留下文件夹名包括a的文件夹
        File[] files = f.listFiles(f1 -> f1.isDirectory() && f1.getName().contains("a"));

        //仅留下.txt结尾的文本文件
        File[] files1 = f.listFiles(f2 -> f2.isFile() && f2.getName().endsWith(".txt"));

        // 仅留下以a开头的文件
        File[] files3 = f.listFiles(f3 -> f3.isFile() && f3.getName().startsWith("a"));


        for (File file : files3) {
            System.out.println(file);
        }

    }
}

/*
class A implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isFile();
    }
}*/
