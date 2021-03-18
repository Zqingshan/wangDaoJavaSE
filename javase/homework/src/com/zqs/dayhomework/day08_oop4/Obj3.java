package com.zqs.dayhomework.day08_oop4;

/**
 * @description:第五题
 * @author: z_qingshan
 * @create: 2021-03-09
 **/

/**
 * @description: test
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/
public class Obj3 extends Obj1 {
    Obj2 ob2 = new Obj2();  //9、    //12、

    public Obj3() { //2、
        System.out.println("obj3");  //13、
    }

    //1、首先找到main方法
    public static void main(String[] args) {
        Obj3 obj3 = new Obj3();  //14、
    }
}

class Obj1 {
    Obj2 ob2 = new Obj2(); //4、     //7、

    public Obj1() { //3、
        System.out.println("Obj1"); //8、
    }
}

class Obj2 {
    public Obj2() { //5、    //10、
        System.out.println("obj2"); //6、   //11、
    }
}
