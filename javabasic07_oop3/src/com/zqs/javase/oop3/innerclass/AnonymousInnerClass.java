package com.zqs.javase.oop3.innerclass;

/**
 * @description: 匿名内部类
 * @author: z_qingshan
 * @create: 2021-03-10
 **/

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 { //外部类
    private int n1 = 10;

    public void method() {
        //基于接口的匿名内部类
        //1、需求：使用接口IA，并创建对象
        //2、传统方式是，写一个类，实现该接口，并创建对象
        //3、需求是 Tiger类 只使用一次，后面不再使用
        //4、可以使用匿名内部类来简化开发
        //5、tiger的编译类型？ IA
        //6、tiger的运行类型？ 就是匿名内部类  Outer04$1
        /*
        我们看底层，会分配类名 Outer04$1
        class Outer04$1 implements IA{
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        }
        */
        //7、jdk底层创建匿名内部类 Outer04$1，立即马上就创建了Outer04$1实例，并且把地址返回给tiger
        //8、匿名内部类使用一次就不能再使用了，但是tiger这个对象可以反复使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass()); //Outer04$1
        tiger.cry();

        IA dog = new IA() {
            @Override
            public void cry() {
                System.out.println("狗子叫唤...");
            }
        };
        System.out.println("dog的运行类型=" + dog.getClass()); //Outer04$2
        dog.cry();


        /*Tiger tiger = new Tiger();
        tiger.cry();*/

        //基于类的匿名内部类
        //1、father的编译类型 Father
        //2、father的运行类型 Outer04$3
        //3、底层会创建匿名内部类
        /*
        class Outer04$3 extends Father{
        }
        */
        //4、同时也直接返回了 匿名内部类 Outer04$3 的对象
        //5、注意("Jack") 参数列表会传递给 Father构造器
        Father father = new Father("Jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass()); //Outer04$3
        father.test();

        //基于抽象类的匿名内部类，抽象方法必须要实现
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}

interface IA {
    public void cry();
}

/*class Tiger implements IA {
    @Override
    public void cry() {
        System.out.println("老虎cry");
    }
}*/


class Father {
    public Father(String name) {
        System.out.println("接收到name=" + name);
    }

    public void test() {
    }
}

abstract class Animal {
    abstract void eat();
}