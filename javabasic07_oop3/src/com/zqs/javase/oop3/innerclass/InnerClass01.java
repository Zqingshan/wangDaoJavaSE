package com.zqs.javase.oop3.innerclass;

/**
 * @description: 内部类
 * @author: z_qingshan
 * @create: 2021-03-10
 **/
public class InnerClass01 { //外部其他类

}

class Outer { //外部类
    private int n1 = 100; //属性

    public Outer(int n1) { //构造器
        this.n1 = n1;
    }

    public void m1() { //方法
        System.out.println("m1()");
    }

    //代码块
    {
        System.out.println("代码块。。。");
    }

    class Inner{ //内部类，在Outer类的内部

    }
}