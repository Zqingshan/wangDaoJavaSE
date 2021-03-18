package com.zqs.dayhomework.day05_oop1.test02;

/**
 * @description: 定义一个表示学生信息的类Student，要求如下：
 * （1）类Student的成员变量：id表示学号；name表示姓名；gender表示性别；age表示年龄；java表示Java课程成绩。
 * （2) 再定义一个print()方法，输出student对象的 name，gender，age，java的值(即输出学生信息)
 * （3）根据类Student的定义，创建五个该类的对象，输出每个学生的信息，计算并输出这五个学生Java语言成绩的平均值，
 * 提示： 数组既可以存储基本数据类型的值，也可以存储引用数据类型的值
 * 因此，5个Student对象可以放在一个Student数组中 Student[] students = new Student[5];   students[1] = student对象的引用
 * 求平均值可以通过循环遍历 students数组来完成
 * @author: z_qingshan
 * @create: 2021-03-05
 **/
public class test02 {
    public static void main(String[] args) {
        Student student = new Student(1, 20, 88.5, "张三", '男');
        //调用print()方法
        student.print();

        //方式1
        Student students[]={new Student(2, 20, 88.5, "拉丝", '女'),
                new Student(3, 21, 97.0, "王五", '男'),
                new Student(4, 19, 65.7, "翠花", '女'),
                new Student(5, 22, 60.0, "王二狗", '男'),
                new Student(6, 24, 78.8, "小燕子", '女')};


        //方式2

        //定义数组
        //Student[] students = new Student[5];
        //创建5个student对象
        /*Student stu1 = new Student(2, 20, 88.5, "拉丝", '女');
        Student stu2 = new Student(3, 21, 97.0, "王五", '男');
        Student stu3 = new Student(4, 19, 65.7, "翠花", '女');
        Student stu4 = new Student(5, 22, 60.0, "王二狗", '男');
        Student stu5 = new Student(6, 24, 78.8, "小燕子", '女');*/

        //把对象存进数组中
        /*students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;
        students[3] = stu4;
        students[4] = stu5;*/

        //输出每个学生的信息
        for (int i = 0; i < students.length; i++) {
            students[i].print(); //循环调用方法
        }
        /*stu1.print();
        stu2.print();
        stu3.print();
        stu4.print();
        stu5.print();*/

        //求Java课程成绩平均值
        student.getAvgJava(students);
    }
}
class Student {
    //属性
    int id; //学号
    int age; //年龄
    double java; //Java课程成绩
    String name; //名字
    char gender; //性别

    //构造方法
    public Student(int id, int age, double java, String name, char gender) {
        this.id = id;
        this.age = age;
        this.java = java;
        this.name = name;
        this.gender = gender;
    }

    //print()方法
    public void print() {
        System.out.println("\n-------------------学生信息如下-------------------\n");
        System.out.println("姓名：" + this.name + "，年龄：" + this.age + "，学号：" + this.id +
                "，性别：" + this.gender + "，Java课程成绩：" + this.java);
    }

    //求平均值
    public void getAvgJava(Student[] students) {
        System.out.println("\n==================================================");
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].java; //成绩累加
        }
        System.out.println("Java课程总分是：" + sum + "，平均分是：" + (sum / students.length));
    }
}