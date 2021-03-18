package com.zqs.dayhomework.day05_oop1;

/**
 * @description: 对于一个长方体，定义两个方法，
 * 分别计算并输出长方体的体积和表面积
 * 注意使用面向对象思想去做，想想谁是属性，谁是行为
 * @author: z_qingshan
 * @create: 2021-03-05
 **/
public class test03 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(2.2, 2.2, 3.3);
        cuboid.getVolume();
        cuboid.getSurfaceArea();
    }
}

class Cuboid {
    //属性
    double length; //长度
    double width; //宽度
    double height; //高度

    //构造方法
    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    //行为

    //求体积方法
    public void getVolume() {
        System.out.println("长：" + this.length + "，宽：" + this.width + "，高：" + this.height + "的长方体体积是：" +
                this.length * this.width * this.height);
    }

    //求表面积方法
    public void getSurfaceArea() {
        System.out.println("长：" + this.length + "，宽：" + this.width + "，高：" + this.height + "的长方体表面积是："
                + (this.length * this.width + this.length * this.height + this.width * this.height) * 2);
    }
}
