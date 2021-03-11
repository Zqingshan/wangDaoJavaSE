package com.zqs.javase.oop3_wangdao.interface2.basic2.impl;

import com.zqs.javase.oop3_wangdao.interface2.basic2.IA;
import com.zqs.javase.oop3_wangdao.interface2.basic2.IB;
import com.zqs.javase.oop3_wangdao.interface2.basic2.IC;
//import com.cskaoyan.javase.oop3.interface2.basic2.ITest;

/**
 * @description: ITest接口的实现类
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class ITestImpl implements IA, IB, IC {

    public static void main(String[] args) {
        //ITestImpl iTest = new ITestImpl();
        //iTest.test1();
        //iTest.test2();
        //iTest.test3();

        //接口名点的形式去方法接口的静态方法
        //ITest.testStaticMethod();
        //接口的静态方法 可以被子类继承吗？ 不能被子类继承,只能用接口名去调用
        //Static method may be invoked on containing interface class only
        //ITestImpl.testStaticMethod();
    }
    //
    //@Override
    //public void test() {
    //    System.out.println("ITest接口中抽象方法");
    //}
}
