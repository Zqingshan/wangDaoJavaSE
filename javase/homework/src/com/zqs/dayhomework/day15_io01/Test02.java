package com.zqs.dayhomework.day15_io01;

/**
 * @description: 第二题
 * @author: z_qingshan
 * @create: 2021-03-17
 **/

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 键盘输入文件名，文件内容，按照输入的文件名，文件内容保存。
 * 要求输入内容的时候可以多次追加写入，以一个约定字符串表示结束输出内容，
 * 比如当输入end时表示终止内容输入。
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("输入文件名：");
        String fileName = sc.next();
        FileOutputStream out = new FileOutputStream(fileName + ".txt", true);

        while (true) {
            System.out.print("输入文件内容，以end结束输入：");
            String fileContent = sc.next();
            if ("end".equals(fileContent)) {
                out.close();
                return;
            }

            out.write(fileContent.getBytes());
            out.write(System.lineSeparator().getBytes());
        }
    }
}
