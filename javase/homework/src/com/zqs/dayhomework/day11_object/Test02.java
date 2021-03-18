package com.zqs.dayhomework.day11_object;

/**
 * @description: Lambda练习
 * @author: z_qingshan
 * @create: 2021-03-12
 **/
public class Test02 {
    public static void main(String[] args) {
        //无返回值无参数的功能接口
        //方式一
        /*INoReturnNoParam irp = () -> {
            System.out.println("无返回值无参数的功能接口");
        };
        irp.test();*/
        //方式二
        INoReturnNoParam irp = () -> System.out.println("无返回值无参数的功能接口");
        irp.test();

        //无返回值有一个参数的功能接口
        //方式一
        /*INoReturnOneParam irop = (int a) -> {
            System.out.println("无返回值有一个参数的功能接口，a=" + a);
        };
        irop.test(3);*/
        //方式二
        INoReturnOneParam irop = (int a) -> System.out.println("无返回值有一个参数的功能接口，a=" + a);
        irop.test(3);

        //无返回值两个参数的功能接口
        //方式一
        /*INoReturnTwoParam irtp = (int a, int b) -> {
            System.out.println("无返回值两个参数的功能接口，a+b=" + (a + b));
        };
        irtp.test(2, 5);*/
        //方式二
        INoReturnTwoParam irtp = (int a, int b) -> System.out.println("无返回值两个参数的功能接口，a+b=" + (a + b));
        irtp.test(3, 5);

        //有返回值无参数的功能接口
        IHasReturnNoParam irnp = () -> {
            int a = 0;
            System.out.println("有返回值无参数的功能接口");
            return a;
        };
        irnp.test();

        //有返回值一个参数的功能接口
        IHasReturnOneParam irop2 = (int a) -> {
            System.out.println("有返回值一个参数的功能接口，a=" + a);
            return a;
        };
        irop2.method(5);

        //有返回值两个参数的功能接口
        IHasReturnTwoParam irtp2 = (int a, int b) -> {
            System.out.println("有返回值两个参数的功能接口，a + b = " + (a + b));
            return a + b;
        };
        irtp2.test(3, 6);

        /*参考答案
         INoReturnNoParam ir1 = () -> {
            System.out.println("无返回值无参数的功能接口");
        };
        ir1.test();

        ((INoReturnOneParam) a -> {
            System.out.println("无返回值有一个参数的功能接口,其参数是:" + a);
        }).test(10);

        INoReturnTwoParam ir2 = (a, b) -> System.out.println("无返回值两个参数的功能接口,其两个参数分别是:" + a + "," + b);

        ir2.test(10, 20);
        IHasReturnNoParam ir3 = () -> {
            int a = 10;
            int b = 20;
            return a + b;
        };
        System.out.println("有返回值无参数的功能接口,其返回值是:" + ir3.test());

        IHasReturnOneParam ir4 = a -> ++a;
        System.out.println("有返回值一个参数的功能接口,其返回值是" + ir4.test(10));


        IHasReturnTwoParam ir5 = (a, b) -> a + b;
        System.out.println("有返回值两个参数的功能接口,其返回值是:" + ir5.test(1,2));
         */
    }


}

//无返回值无参数的功能接口
@FunctionalInterface
interface INoReturnNoParam {
    void test();
}

//无返回值有一个参数的功能接口
@FunctionalInterface
interface INoReturnOneParam {
    void test(int a);
}

//无返回值两个参数的功能接口
@FunctionalInterface
interface INoReturnTwoParam {
    void test(int a, int b);
}

//有返回值无参数的功能接口
@FunctionalInterface
interface IHasReturnNoParam {
    int test();
}

//有返回值一个参数的功能接口
@FunctionalInterface
interface IHasReturnOneParam {
    int method(int a);
}

//有返回值两个参数的功能接口
@FunctionalInterface
interface IHasReturnTwoParam {
    int test(int a, int b);
}