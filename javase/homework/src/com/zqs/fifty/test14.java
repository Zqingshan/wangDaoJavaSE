package com.zqs.fifty;


/**
 * @author z_qingshan
 * @create 2021-02-20
 */
public class test14 {
    public static void main(String[] args) {
        //题目：判断101-200之间有多少个素数，并输出所有素数。
        //程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。

        //方法1
        int count = 0; // 计数
        boolean flag = true; //在当一个数有【除1和它本身之外的因数】时，使其值变为false，以便进入下一次循环
        for (int i = 101; i <= 200; i++) {
            for (int j = 2; j < i; j++) {
                //每完成一次for循环需要把flag值重新置为true，否则将会影响下次的循环
                flag = true;
                // 如果i%j==0,说明i有【除1和它本身之外的因数】,让flag=false并跳出双重循环
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            //从双重for循环退出后，判断flag的值是否是true，若为true则说明此数为素数
            if (flag == true) {
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("101-200之间素数有" + count + "个");

        //方法2
        /*count = 0; //计数
        for (int i = 101; i <= 200; i++) {
            for (int j = 2; j <= i; j++) {
                if (i != j && i % j == 0) { //素数就是1和它本身，不能被其他的数整除，否则，就跳出
                    break;
                } else if (i == j && i % j == 0) { //素数就是1和它本身，不能被其他的数整除，则打印出count++; // 计数循环次数
                    System.out.print(i + "\t");
                }
            }
        }
        System.out.println();
        System.out.println("101-200之间有" + count + "个素数");*/

        //方法3
        /*for (int i = 101; i < 200; i++) {
            boolean b = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b) {
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.println("一共有" + count + "个素数");*/
    }
}
