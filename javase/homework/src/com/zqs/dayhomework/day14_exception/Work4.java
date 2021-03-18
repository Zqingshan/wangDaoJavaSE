package com.zqs.dayhomework.day14_exception;

/**
 * @description: 作业4
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 *4，自己找一个目录，里面放些一下文件，文件夹
 * 用带过滤器的listFiles方法进行筛选
 * 条件一：仅留下文件夹名包括a的文件夹
 * 条件二：仅留下.txt结尾的文本文件
 * 条件三：仅留下以a开头的文件
 *
 */
public class Work4 {
    public static void main(String[] args) {
        File f = new File("E:\\2");
        //条件一：仅留下文件夹名包括a的文件夹 匿名内部类对象
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() && pathname.getName().contains("a");
            }
        });
        System.out.println(Arrays.toString(files));

        //条件二：仅留下.txt结尾的文本文件 lambda表达式
        File[] files1 = f.listFiles(f1 -> f1.isFile() && f1.getName().endsWith(".txt"));
        System.out.println(Arrays.toString(files1));

        //条件三：仅留下以a开头的文件 lambda表达式指向了已实现方法
        File[] files2 = f.listFiles(Work4::myAccept);
        System.out.println(Arrays.toString(files2));
    }

    public static boolean myAccept(File file) {
        return file.isFile() && file.getName().startsWith("a");
    }
}
