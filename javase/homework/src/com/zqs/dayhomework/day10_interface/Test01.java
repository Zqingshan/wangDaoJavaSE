package com.zqs.dayhomework.day10_interface;

/**
 * @description: 第一题
 * @author: z_qingshan
 * @create: 2021-03-11
 **/
public class Test01 {
    public static void main(String[] args) {
        //创建并初始化Bean1类对象bean1
        //(1)
        Test01.Bean1 bean1 = new Test01().new Bean1();
        bean1.i++;
        // 创建并初始化Bean2类对象bean2
        //(2)
        Bean2 bean2 = new Bean2();
        bean2.j++;
        //创建并初始化Bean3类对象bean3
        //(3)
        Bean.Bean3 bean3 = new Bean().new Bean3();
        bean3.k++;
    }

    class Bean1 {
        public int i = 0;
    }

    static class Bean2 {
        public int j = 0;
    }
}

class Bean {
    class Bean3 {
        public int k = 0;
    }
}
