package com.zqs.javase.oop3.innerclass;

/**
 * @description: 匿名内部类使用细节
 * @author: z_qingshan
 * @create: 2021-03-10
 **/
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println("main Outer05的hashcode" + outer05);
    }
}

class Outer05 {
    private int n1 = 10;

    public void f1() {
        //创建一个基于类的匿名内部类
        //不能添加访问修饰符，因为它的地位就是一个局部变量
        Person p = new Person() {
            private int n1 = 88;

            @Override
            public void hi() {
                //可以直接访问外部类的所有成员，包含私有的
                //如果外部类和内部类的成员重名时，内部类访问的话，默认遵循就近原则，
                // 如果想访问外部类的成员，则可以使用（外部类名.this.类名）去访问
                System.out.println("匿名内部类重写了hi方法 外部类的n1=" + Outer05.this.n1 + "，内部类的n1=" + n1);
                System.out.println("Outer05的hashcode" + Outer05.this);
            }
        };
        p.hi(); //动态绑定 运行类型是 Outer05$1

        //匿名内部类的第二种调用方式，可以直接代用调用，匿名内部类本身也是返回对象
        //class 匿名内部类 extends Person{}
        /*new Person() {
            @Override
            public void hi() {

                System.out.println("匿名内部类重写了 hi方法，哈哈哈");
            }
            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("Jack");*/
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String str) {
        System.out.println("Person ok()" + str);
    }
}