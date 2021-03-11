package com.zqs.javase.oop3_wangdao.interface2.exercise4;

/**
 * @description: 练习2
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 教练（Coach）和运动员（Sportsman）案例
 *
 * - 乒乓球（TableTennis）运动员和篮球（basketball）运动员
 * - 乒乓球教练和篮球教练
 * - 为了出国交流，跟乒乓球相关的人员都需要学习英语
 *
 * 抽象类: 抽象的教练类 抽象的运动员类
 * 接口: 学习英语
 * 具体类: 篮球教练/篮球运动员,乒乓球教练/乒乓球运动员
 *
 * 这个案例中 难的不是写代码，而是怎么把这个体系设计出来 理清楚它们之间的关系
 *
 * 开发：crud工程师
 * 接口工程师
 * 面向接口编程
 *
 * 做一个高中学生管理系统，高一，高二，高三
 * 接下来要对学生信息进行增删改查
 * 往往都是先写接口，把这些增删改查的方法 定义出来，然后再去写实现
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        //随便创建几个对象
        ILearningEnglish i;
        i = new TableTennisSportsman();
        i.learn();
        //((TableTennisSportsman) i).battle();
    }
}

abstract class AbstractCoach{
    int age;
    double salary;
    String teachKind;

    //抽象方法
    public abstract void teach();
}
abstract class AbstractSportsman{
    int age;
    double salary;
    String sportKind;

    //抽象方法
    public abstract void battle();
}

interface ILearningEnglish{
    void learn();
}

class BasketballCoach extends AbstractCoach{

    @Override
    public void teach() {
        System.out.println("我教打篮球！");
    }
}
class BasketballSportsman extends AbstractSportsman{

    @Override
    public void battle() {
        System.out.println("我要和别人打篮球了");
    }
}
class TableTennisCoach extends AbstractCoach implements ILearningEnglish{
    @Override
    public void teach() {
        System.out.println("我教乒乓球");
    }

    @Override
    public void learn() {
        System.out.println("我想学英语");
    }
}class TableTennisSportsman extends AbstractSportsman implements ILearningEnglish{

    @Override
    public void learn() {
        System.out.println("我想学英语");
    }

    @Override
    public void battle() {

    }
}