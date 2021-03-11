package com.zqs.controflow.recycle.fors;

/**
 * @author z_qingshan
 * @create 2021-01-28
 *
 *
 * 循环结构
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++){
            System.out.println(i + " " + "HelloWorld");
        }*/

        //练习1 在控制台输出1-10,10-1
        //输出1-10
        for (int i = 1;i <= 10;i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------");

        //输出10-1
        for (int i = 10;i >= 1;i--){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------");

        //练习2 求出1-10之间数据之和
        int sum = 0;
        for (int i = 1;i <= 10;i++){
            sum += i;
        }
        System.out.println("1-10之间的数据之和是：" + sum);

        System.out.println("-----------------------");

        //练习3 求出1-100之间偶数和
        sum = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-100之间偶数和是：" + sum);

        System.out.println("-----------------------");

        //练习4 求5的阶乘
        //5*4*3*2*1
        int multi = 1;
        for (int i = 5; i >= 1; i--) {
            multi *= i;
        }
        System.out.println("5的阶乘是：" + multi);

        System.out.println("-----------------------");

        //练习5 求水仙花数
        //水仙花数： 一个三位数【100-999】，各位上的数字的立方和的值等于该数字本身
        int count = 0;//计数变量
        System.out.println("100-999之内的水仙花数：");
        for (int i = 100; i <= 999 ; i++) {

            //数位拆解
            //求个位
            int n = i % 10;
            //求十位
            int m = i / 10 % 10;
            //求百位
            int b = i / 100;

            //判断一个数是不是水仙花数
            if (m * m * m + n * n * n + b * b * b == i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("100-999之内的水仙花数有" + count + "个");

        System.out.println("-----------------------");

        //练习6 百钱买百鸡
        //中国古代数学家张丘建在他的《算经》中提出了一个著名的“百钱买百鸡问题”：
        // 鸡翁一，值钱五，鸡母一，值钱三，鸡雏三，值钱一，百钱买百鸡，问翁、母、雏各几何？
        //公鸡1只5元，母鸡1只3元，小鸡3只1元
        int cock,hen,chick; //公鸡，母鸡，小鸡
        for (cock = 0; cock <= 20; cock++) { //最多买20只公鸡
            for (hen = 0; hen <= 33; hen++) { //最多买33只母鸡
                for (chick = 3; chick <= 99; chick += 3) { //最多买99只小鸡，每次叠加3，3只起卖
                    if (5 * cock + 3 * hen + chick / 3 == 100){ //百钱，小鸡数/3得出价格
                        if (cock + hen + chick == 100){ //百鸡
                            System.out.println("公鸡：" + cock + "  " + "母鸡："
                                    + hen + "  " + "小鸡：" + chick);

                        }
                    }
                }
            }
        }

        System.out.println("-----------------------");

        //逗号运算符
        for (int i = 1,j = i + 10;i < 5;i++,j = i * 2){
            System.out.println("i=" + i + " " + "j=" + j);
        }

        System.out.println("-----------------------");

        //foreach语句
        int arr[] = {1,2,3,4,5};

        //普通遍历
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("数组中的元素有：");
        for (int x : arr){
            System.out.println(x);
        }
    }
}

