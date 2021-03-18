package com.zqs.dayhomework.day15_io01;

/**
 * @description: 第一题
 * @author: z_qingshan
 * @create: 2021-03-17
 **/

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 分别键盘输入文件名 和 文件内容，并按照文件名保存相应的内容
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("输入文件名：");
        String fileName = sc.next();

        System.out.print("输入文件内容：");
        String fileContent = sc.next();

        FileOutputStream out = new FileOutputStream(fileName + ".txt");
        out.write(fileContent.getBytes());

        out.close();
    }
}
