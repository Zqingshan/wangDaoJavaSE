package com.stage3.entity;


/**
 * @description: 存学生对象的类，包括对这些对象的操作
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class StudentList {
    private Student[] studs;

    //为了方便明确的知道数组中有多少有效的学生对象,需要一个指示器
    //需要一个静态成员
    private static int count = 0;

    //构造方法
    public StudentList(int stuNums) {
        this.studs = new Student[stuNums];
    }

    public StudentList() {
    }

    //该类需要完成对studs数组的增删改查 四个基本操作，并且可以打印输出所有学生的信息

    //新增学生信息
    public boolean createStudent(Student s) {
        //该方法为新增学生信息，而不是修改或者覆盖，也就是说只有当数组中有null的位置的时候才能新增学生
        //遍历数组，找到null的位置
        for (int i = 0; i < studs.length; i++) {
            if (studs[i] == null) {
                //找到第一个等于null的位置的下标i
                //把方法的参数学生对象 装入数组中
                studs[i] = s;
                //输出提示语句：存入学生信息成功！
                //System.out.println("存入学生信息成功！");
                StudentList.count++;
                return true; //表示存入成功
            }
        }
        //程序执行到这里还没结束，表示数组满了，不能装了，提示用户，并返回false
        //System.out.println("数组已满，无法存入学生信息！");
        return false;
    }

    //删除学生信息

    //修改某个学生信息

    //查找某个学生

    //返回装有全部有效学生信息的数组
    //不会返回null
    public Student[] getAllStudent() {
        //如果当前数组为null或者长度为0 返回长度为0的数组
        if (studs == null || studs.length == 0) {
            return new Student[0];
        }
        //程序执行到这里 数组都是正常的数组了
        //这里需要剔除数组中等于null的元素,然后把有效学生对象放入数组
        Student[] returnStuds = new Student[StudentList.count]; //count表示有效对象个数
        for (int i = 0; i < studs.length; i++) {
            if (studs[i] != null) {
                returnStuds[i] = studs[i];
            }
        }
        return returnStuds;
    }

}
