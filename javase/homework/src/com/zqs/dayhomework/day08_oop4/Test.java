package com.zqs.dayhomework.day08_oop4;

/**
 * @description:
 * @author: z_qingshan
 * @create: 2021-03-09
 **/

/**
 * @description: 试题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/
public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}

class Base {
    static {
        System.out.println("base 静态代码块");
    }

    {
        System.out.println("base 构造代码块");
    }

    public Base() {
        //super();
        System.out.println("base无参构造");
    }
}

class Sub extends Base {
    static {
        System.out.println("sub 静态代码块");
    }

    {
        System.out.println("sub 构造代码块");
    }

    public Sub() {
        super();
        System.out.println("sub 无参构造");
    }
}
