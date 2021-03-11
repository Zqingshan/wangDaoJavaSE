package com.zqs.javase.oop3.interface2.basic2;

/**
 * @description: 接口的成员特征
 * @author: z_qingshan
 * @create: 2021-03-10
 **/


/**
 * > 接口的成员特征：
 * > - 成员变量
 * 接口中成员变量默认都是public static final修饰，全局常量
 * 注意这些修饰符都是默认的，可以不写的
 * 注意事项：接口的全局常量无法用static代码块初始化
 * > - 成员方法
 * 抽象类中可以有抽象方法，也可以有普通方法
 * 那接口呢？
 * 1，接口可以有抽象方法，并且接口中的方法默认都是
 * public abstract修饰的
 * 2，接口没有普通方法
 * 3，补充，了解的知识点
 * Java8以后，Java引入了接口的默认方法和静态方法
 * 默认方法的语法
 * [权限修饰符] default 返回值类型 方法名(){}
 * 默认方法 默认是public修饰，可以不写
 * <p>
 * 如果Java接口中都这么写，然后一个类可以实现多个接口，
 * 这实际上是什么？是不是就是多继承
 * <p>
 * 大家思考:提供这种默认方法有什么意义？
 * 可以理解成复用，作为子类的一个默认实现
 * 但是大家不要这么用
 * 接口主要是作为一种规范，尽量不要添加default方法
 * <p>
 * 那么为什么Java官方还要搞一个东西？
 * 本义不是实现多继承
 * 假设我有一个接口，很多类实现了这个接口，有一天这个接口中，我想要新增一个功能。
 * 如果这个方法是抽象的，这些很多类都要实现这个方法
 * 于是，Java官方为了省事，就引入了默认方法
 * 这种方法就不需要重写了，于是我就可以自由选择在什么地方进行重写
 * 相对来说省事
 * 对于我们而言，你也不要做这种图省事的事情，就直接定义新接口就可以了。
 * 时代变了，大家都在接口写default方法
 * <p>
 * Java8除了引入了default方法，还引入了静态方法static方法
 * 语法：[访问权限修饰] static 返回值类型 方法名(){}
 * 默认是public修饰，可省略
 * 静态方法可以通过接口名点的形式访问
 * 实现类无法调用
 * 从技术角度来说，以上实现方法是完全合法的
 * - 只是它看起来违反了接口作为一个抽象定义的理念
 * - 除非特别有必要，不要使用
 * <p>
 * <p>
 * > - 构造方法
 * 抽象类中有构造方法，那接口呢？
 * 1，接口不能实例化，所以自己不需要构造器
 * 2，接口中都是常量，子类不需要构造器给它们初始化
 * 综上，接口有构造器是画蛇添足，多此一举
 * 所以，接口是没有构造方法的
 * <p>
 * 大家发现接口和接口的成员都是public修饰的，
 * 这样做是为了体现设计的思想
 * 设计接口就是为了让子类实现的，所以我竭尽可能给你提供方法，public就是最宽泛的访问权限
 * 体现了封装的思想
 * <p>
 * 接口的子类特征：
 * 如果是一个普通的类实现了接口
 * 1，这个普通的类必须实现接口中的所有抽象方法
 * 也可以将这个类定义为抽象类,就不用实现了
 * 2,一个类实现了接口，就变成了接口的子类
 * 3，接口可以多实现，配合default方法可以实现多继承（最好不要这么干）
 * 4，如果一个类又继承类又实现接口，一定是先继承再实现，顺序不能互换
 * 如果是一个抽象类实现了接口
 * 1，可以不实现接口中的所有抽象方法
 * 2，可以实现多个接口而不重写方法
 * 3，抽象类也可以继承普通类
 * 接口之间是什么样的关系？
 * 1，接口之间不是实现
 * 2，接口之间可以继承
 * 3, 接口之间可以多继承
 * 4，接口不能继承类，不管是普通类还是抽象类
 */
public class Demo {
    public static void main(String[] args) {
        //创建子类对象，用接口类型接收
        ITest it = new A();
        it.testDefaultMethod();

        //访问静态方法
        ITest.testStaticMethod();
    }
}

interface ITest {
    //定义成员变量
    //int a; Variable 'a' might not have been initialized
    /*int a; //Not allowed in interface
    {
        a = 10;
    }*/

    //定义全局常量
    public static final int A = 10; //Modifier 'final' is redundant for interface fields
    //正常来说，定义接口的成员变量，直接
    int a = 10;

    //定义成员方法
    //接口中是有抽象方法的
    public abstract void testAbstractMethod();

    //正常情况下，接口中的方法直接这么写
    void testAbstractMethod1();

    //普通方法
    /*Interface abstract methods cannot have body
    public void testMethod(){
    }*/

    //默认方法
    default void testDefaultMethod() {
        //System.out.println("我是Java8以后的默认方法");
    }

    //静态方法
    static void testStaticMethod(){
        System.out.println("我是Java8以后的静态方法");
    }

    //定义构造方法,接口没有构造方法
    /*Interface abstract methods cannot have body
    public ITest(){}*/

}

class A implements ITest {

    @Override
    public void testAbstractMethod() {

    }

    @Override
    public void testAbstractMethod1() {

    }

}