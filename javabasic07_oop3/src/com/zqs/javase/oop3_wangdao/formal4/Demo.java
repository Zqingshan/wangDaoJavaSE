package com.zqs.javase.oop3_wangdao.formal4;

/**
 * @description: 方法的形式参数（formal）在传值的时候会存在类型提升
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 基本数据类型：存在自动类型提升
 * 引用数据类型：存在向上转型：可以传入一个对象，或者它的子类对象
 *      子类可以看成一个父类
 *      如果是抽象类作形参 传入抽象类子类
 *     如果是接口作为形参 传入实现类
 *
 */
public class Demo {
    public static void main(String[] args) {
        //test(10L);
        //test(new Student());
        //test(new StudentSon());
        //
        //test(new Student());
        test(new A());
    }
    public static void test(double a){
    }
    //public static void test(Student a){
    //}

    public static void test(AbstractStudent a) {
    }

    public static void test(I a) {
    }
}
class Student extends AbstractStudent{

}
class StudentSon extends Student{

}
abstract class AbstractStudent{
}
interface I{

}

class A implements I{

}