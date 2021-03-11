package com.zqs.javase.oop3.innerclass;

/**
 * @description: 演示局部内部类的使用
 * @author: z_qingshan
 * @create: 2021-03-10
 **/
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02的hashcode=" + outer02);
    }
}

class Outer02 { //外部类
    private int n1 = 100;

    private void m2() { //私有方法
        System.out.println("Outer02 m2()");
    }

    public void m1() { //方法
        // 1、局部内部类是定义在外部类的局部位置，通常在方法中
        // 3、不能添加访问修饰符，但是可以使用final修饰，加了final就不能被继承
        // 4、作用域：仅仅在定义它的方法或代码块中
        final class Inner02 { //局部内部类(本质仍然是一个类)
            // 2、可以直接访问外部类的所有成员，包含私有的属性以及方法

            private int n1 = 200;

            public void f1() {
                //5、局部内部类可以直接访问外部类的成员，比如下面 外部类 n1 和 m2()
                //7、如果外部类和局部内部类的成员重名时，默认遵循就近原则，
                //   如果想访问外部类的成员，使用（外部类.this.成员）去访问
                //  Outer02.this 本质就是外部类的对象，即哪个对象调用了m1这个方法，那么这个Outer02.this就是哪个对象
                System.out.println("内部类的n1=" + n1 + "，外部类的n1=" + Outer02.this.n1);
                System.out.println("Outer02.this hashcode=" + Outer02.this);
                m2();
            }
        }
        //6、外部类在方法中，可以创建Inner02的对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();

        //class Inner03 extends Inner02{}
    }
}