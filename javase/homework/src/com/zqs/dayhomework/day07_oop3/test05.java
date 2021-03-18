package com.zqs.dayhomework.day07_oop3;

/**
 * @description: 创建两个类，分别用来表示长方形和正方形，
 * 同时定义所需的成员变量，
 * 代表长方形或者正方形的边长（注意私有化成员变量）
 * 在两个类中分别定义两个方法，用来求对应形状的面积和周长，
 * 并定义相应的get，set方法，获取和改变方形和正方形的边长。
 * @author: z_qingshan
 * @create: 2021-03-08
 **/
public class test05 {
    public static void main(String[] args) {
        //设置长方形边长和宽
        Rectangle re = new Rectangle();
        re.setLength(5);
        re.setWidth(4);
        System.out.println("长方形的面积："+re.getRectangleArea(re.getLength(), re.getWidth()));
        System.out.println("长方形的周长："+re.getRectanglePer(re.getLength(), re.getWidth()));

        //设置正方形的边长
        Square square = new Square();
        square.setLength(5);
        System.out.println("正方形的面积：" + square.getSquareArea(square.getLength()));
        System.out.println("正方形的周长：" + square.getSquarePer(square.getLength()));
    }
}

//长方形
class Rectangle {
    //边长
    private int length;
    //宽
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //面积
    public int getRectangleArea(int length, int width) {
        return length * width;
    }

    //周长
    public int getRectanglePer(int length, int width) {
        return (length + width) * 2;
    }
}

//正方形
class Square {
    //边长
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public Square() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //面积
    public int getSquareArea(int length) {
        return length * length;
    }

    //周长
    public int getSquarePer(int length) {
        return length * 4;
    }
}