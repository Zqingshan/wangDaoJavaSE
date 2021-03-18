package com.zqs.dayhomework.day12_clone;

/**
 * @description:
 * @author: z_qingshan
 * @create: 2021-03-13
 **/

/**
 * 有一个Teacher类
 * 属性：int age;String name;Student s
 * 学生类Student
 * 属性：int age；String name；Star s
 * 明星类Star
 * 属性：int age，String name
 * <p>
 * 尝试深度克隆Teacher对象
 * 结合String的不可变性，想一想String虽然是引用数据类型，需要进行深度克隆吗？
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher t = new Teacher(25, "Jack", new Student(18, "Tom", new Star(30, "Mary")));
        Teacher cloneT = t.clone();

        System.out.println("Teacher的信息：" + t);
        System.out.println("cloneT的信息：" + cloneT);

        System.out.println("Teacher的hashcode：" + t.hashCode());
        System.out.println("cloneT的hashcode：" + cloneT.hashCode());

        System.out.println("老师的年龄=" + t.age);
        System.out.println("clone老师的年龄=" + cloneT.age);

        t.age = 10;
        System.out.println("修改老师的年龄=" + t.age);
        System.out.println("clone老师的年龄=" + cloneT.age);
    }
}

// Teacher类
class Teacher implements Cloneable {
    int age;
    String name;
    Student s;

    @Override
    public Teacher clone() throws CloneNotSupportedException {
        Teacher cloneTeacher = (Teacher) super.clone();
        //克隆s指向的Student对象
        Student cloneStudent = cloneTeacher.s.clone();
        //cloneTeacher中的s引用指向cloneStudent对象
        cloneTeacher.s = cloneStudent;
        return cloneTeacher;
    }

    public void getTeacherInfo() {
        System.out.println("年龄：" + age + "，姓名：" + name + "，学生年龄：" + s.age + "，学生姓名：" + s.name);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", s=" + s +
                '}';
    }

    public Teacher(int age, String name, Student s) {
        this.age = age;
        this.name = name;
        this.s = s;
    }

    public Teacher() {
    }
}

//Student
class Student implements Cloneable {
    int age;
    String name;
    Star s;

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student cloneStudent = (Student) super.clone();
        Star cloneStar = cloneStudent.s.clone();
        cloneStudent.s = cloneStar;
        return cloneStudent;
    }

    public Student(int age, String name, Star s) {
        this.age = age;
        this.name = name;
        this.s = s;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", s=" + s +
                '}';
    }
}

//Star
class Star implements Cloneable {
    int age;
    String name;

    @Override
    public Star clone() throws CloneNotSupportedException {
        return ((Star) super.clone());
    }

    public Star(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Star() {
    }

    @Override
    public String toString() {
        return "Star{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}