package com.zqs.javase.oop3_wangdao.methodreturn5;

/**
 * @description: 方法的返回值中的类型提升
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在方法体中写方法的返回值时，存在类型提升
 * 引用数据类型，存在向上转型
 * 如果返回一个父类，可以在方法体中返回一个子类对象
 * 返回值类型时抽象类，是接口
 * 需要返回抽象类或者接口的子类
 *
 */
public class Demo2 {
    public static void main(String[] args) {

    }

    //public static double test() {
    //    return 1L;
    //}

    //public static I test() {
    //    return new A();
    //}

    public static B test(){
        return new C();
    }
}

interface I {

}

class A implements I {

}

abstract class B{}
class C extends B{}
