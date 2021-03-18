package com.zqs.dayhomework.day14_exception;

/**
 * @description: 第三题
 * @author: z_qingshan
 * @create: 2021-03-16
 **/

import java.io.File;

/**
 * File练习题
 * 递归删除目录
 * <p>
 * 目录结构为如下(尽量不要在c盘中测试)
 * firstLevel目录中，包含一个secondLevel目录和a1.txt和b1.java文件
 * secondLevel目录中包含dir1和dir2两个目录，和a2.txt和b2.java文件
 * dir1目录中包含a3.txt和b3.java文件
 * dir2目录是一个空目录
 * <p>
 * 要求删除firstLevel目录
 * <p>
 * 思路：
 * - 获取目录的下的所有File对象（包括文件和文件夹）
 * - 判断，如果是一个空目录或者file对象不是一个目录而是文件
 * - 直接删除
 * - 程序执行到这里，那么一定是一个目录，且不是空目录
 * - 遍历获取的file数组
 * - 如果这个file对象仍然是一个目录，递归删除该目录
 * - 如果这个file对象是文件，直接删除
 * - 最后不要忘记删除已经是空目录的当前目录
 */
public class Test03 {
    public static void main(String[] args) {
        File f = new File(":\\firstLevel");
        DeleteAll(f);
    }

    public static void DeleteAll(File file) {
        if (!file.exists()) {  //如果目录不存在，退出程序
            System.out.println("目录不存在，程序退出");
            return;
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {   //遍历
                if (f.isDirectory()) {
                    DeleteAll(f);
                } else {
                    f.delete();
                }
            }
        }
        file.delete();
    }
}
