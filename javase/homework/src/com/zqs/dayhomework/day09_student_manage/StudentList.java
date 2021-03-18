package com.zqs.dayhomework.day09_student_manage;

/**
 * @description:
 * @author: z_qingshan
 * @create: 2021-03-10
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

    //新增学生信息
    public boolean createStudent(Student s) {
        for (int i = 0; i < studs.length; i++) {
            if (studs[i] == null) {
                studs[i] = s;
                System.out.println("存入学生信息成功");
                return true;
            }
        }
        System.out.println("数组已满，无法存入学生信息");
        return false;
    }

    //查找学生
    public int seachStu(String name){
        for (int i = 0; i < studs.length; i++) {
            String tempName=studs[i].getName();
            if(tempName.equals(name)){
                studs[i].getStudentInfo();
                return i;
            }
        }
        System.out.println("没有这个学生");
        return -1;
    }

    //删除学生信息


    //返回装有全部有效学生信息的数组
    public Student[] getAllStudent() {
        //如果当前数组为null或者长度为0 返回数组长度为0的数组
        if (studs == null || studs.length == 0) {
            return new Student[0];
        }
        //程序执行到这里，数组都是正常的数组了
        //这里需要剔除数组中等于null的元素，然后把有效学生对象放入数组
        Student[] returnStuds = new Student[StudentList.count];
        for (int i = 0; i < studs.length; i++) {
            if (studs[i] != null) {
                returnStuds[i] = studs[i];
            }
        }
        return returnStuds;
    }
}
