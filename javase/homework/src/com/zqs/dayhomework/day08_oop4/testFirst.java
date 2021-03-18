package com.zqs.dayhomework.day08_oop4;

/**
 * @description: 扩展题1
 * @author: z_qingshan
 * @create: 2021-03-09
 **/
public class testFirst {
    public static void main(String[] args) {
        Father f1 = new Son(1000);
        Father f2 = new Father();
        Son s = new Son(1000);
    }
}

class Father {

    int i = 10;

    public Father() {
        System.out.println(getI());
    }

    public int getI() {
        return i;
    }
}

class Son extends Father {

    int i = 100;

    public Son(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
