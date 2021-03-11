package com.zqs.javase.oop3_wangdao.interface2.basic2;

/**
 * @description: 接口的特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 接口的声明的特点：
 * 接口的声明中隐含了关键字abstract，接口中的方法也是抽象的
 * Modifier 'abstract' is redundant for interfaces
 * 接口的访问权限修饰符也是有两种，public和默认（缺省）
 * 但是普遍来说，接口的访问权限应该是public
 * <p>
 * 接口的成员特点：
 * 1，成员变量
 * Modifier 'static' is redundant for interface fields
 * Modifier 'final' is redundant for interface fields
 * 接口中的成员变量 默认都是public static final修饰的，接口中全是公共的全局常量
 * 这三个修饰符是默认提供了，无需再写
 * 细节：
 * 1，访问权限修饰符public是写死的，不能改
 * 2，接口中虽然是静态常量，但是不能用静态代码块赋值
 * 总得来说，接口是对功能的扩展，接口中大概率没有成员变量，这些了解即可
 * <p>
 * 2，成员方法
 * 接口的成员方法都是抽象方法
 * Modifier 'public' is redundant for interface methods
 * Modifier 'abstract' is redundant for interface methods
 * 接口的方法默认都是public和abstract修饰的，都是抽象方法 接口中的方法都是public修饰
 * Java8之前，接口中是没有实现方法，Java8之后有了
 * 通过Java8之后的接口中的实现方法，从而实现真正意义上的多继承
 * 默认方法：用default修饰
 * [访问权限修饰符] default 返回值类型 方法名(){
 * }
 * 接口中的默认方法是给子类使用的，也是给子类提供一个默认的实现，然后子类可以选择直接用，也可以选择重写
 * 接口中使用默认方法合不合理？
 * 接口作为一种标准，一种规范，它不应该是一个具体的实现，这种实现也没有意义，和抽象类不同。所以普遍来说，绝大多数程序员都认为接口不应该有默认方法。
 * 当然大家可以把这个方法作为了解
 * 这个东西可以用来偷懒，程序的设计体系越来越复杂后，往往引入新的功能会比较麻烦。接口中已经有很多功能了，也有很多实现类了，这个时候我添加一个功能，这个功能有些子类要用，有些子类不用。如果直接在接口中加一个抽象方法，会导致所有子类必须重写，很麻烦。如果重新定义一个接口，也很麻烦，要找哪些子类需要实现。最省事的方法就是默认方法，默认方法不会在子类中报错，子类可以自己选择
 * <p>
 * 我们一般不会有这么复杂的体系，大家也不图省事，去这么做。接口中不应该有实现方法，默认方法只作为了解即可
 * <p>
 * 接口写实现类的格式：
 * 建议大家在接口所处包的下面再新建一个包：impl
 * 然后写实现类：ITestImpl
 * 接口的默认方法可以实现真正意义上的多继承，但是不要这么用
 * Java8还引入了静态成员方法
 * 这种写法也很少见,了解即可
 * <p>
 * <p>
 * 3，构造方法
 * 接口没有构造方法，它既不能创建对象，又没有普通成员变量需要赋值，它要构造方法没有意义
 * <p>
 * <p>
 * 接口子类的特点:
 * 1,普通类
 * 普通类作为接口的子类,必须实现接口的全部抽象方法
 * 类可以实现很多个接口,接口可以多实现
 * <p>
 * 2,抽象类
 * 如果接口中的某一个抽象方法没有实现,该实现类必须设置为抽象类,因为抽象类允许有抽象方法
 * <p>
 * 3,接口
 * 接口之间不叫实现,叫继承
 * implements--->extends
 * 一个接口继承了另一个接口,就得到了另一接口的所有抽象方法
 * 注意:java的类之间是无法多继承的,但是接口之间可以多继承,一个接口可以继承多个接口
 * <p>
 * 总结:
 * 继承是不能跨越种族的
 * 类和类去继承 单继承
 * 接口和接口去继承 多继承
 * <p>
 * 接口和类之间是实现关系,是类实现接口
 * 其他的 像接口继承类 实现类都是不可以的
 */
public class Test implements I3 {
    public static void main(String[] args) {

        //接口是父类 实现类是子类
        //IA ia = new ITestImpl();
        //ia.test1();
        //ITestImpl
        Test t = new Test();
        t.test1();
        t.test2();
        t.test3();
    }
}

interface ITest {
    //定义成员变量
    //Variable 'a' might not have been initialized
    //int a = 10;
    //static int b = 20;
    //static final int C = 30;
    //接口中都是静态常量
    //Modifier 'private' not allowed here
    int A = 10;

    //Not allowed in interface
    //static {
    //    A = 10;
    //}

    //以后大家见到的接口 都是这样的 光秃秃的 里面全是返回值类型和方法名
    void test();

    //java8之后的默认方法
    default void testDefaultMethod() {
        System.out.println("TestDefault");
    }

    //java8之后的静态方法
    static void testStaticMethod() {
        System.out.println("TestStatic");
    }

}

interface I {
    public static void main(String[] args) {
        System.out.println("11111");
    }

    //很多个抽象方法
    default void test1() {
        System.out.println("test1");
    }
}

interface I2 {
    //很多个抽象方法
    default void test2() {
        System.out.println("test2");
    }
}

interface I3 extends I2, I {
    //很多个抽象方法
    default void test3() {
        System.out.println("test3");
    }
}
