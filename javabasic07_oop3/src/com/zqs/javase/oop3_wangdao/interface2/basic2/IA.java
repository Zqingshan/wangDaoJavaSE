package com.zqs.javase.oop3_wangdao.interface2.basic2;

/**
 * @description: IA接口
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public interface IA {
    //很多个抽象方法
    default void test1() {
        System.out.println("test1");
    }

    // static void main(String[] args) {
    //    System.out.println("Hello World");
    //}
}
