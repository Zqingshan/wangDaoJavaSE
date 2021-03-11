package com.zqs.javase.oop3.abstract1.exercise4;

/**
 * @description: 小试牛刀
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/


/**
 * 小试牛刀
 *  我们正在开发一套员工管理系统，需要对公司内部存在的员工进行管理
 *  公司将员工分为三类，普通员工负责杂项工作，程序员负责技术开发，经理负责统筹规划
 *  普通员工包含3个属性：姓名、工号以及工资，行为是工作
 *  程序员包含3个属性：姓名、工号以及工资，行为是工作和加班（overtime work）
 *  经理包含4个属性：姓名、工号、工资以及奖金（bonus），行为是工作
 *
 *  分析：
 *   我们读了需求以后，立刻发现有成员需要复用，立刻想到继承
 *   第一种方案：把普通员工作为一个父类，然后程序员、经理都去继承它
 *   这种方式不好，通过抽象的概念去解释：
 *   1，系统中存不存在普通员工对象？ 肯定存在，普通员工不是抽象概念，按照我们的思路顶层父类应该不能创建对象，而是一个抽象概念
 *   2，抽象类不仅是一个抽象概念，它还代表一个规范，标准。抽象类中定义的方法，（put）子类中必须实现
 * 所以，我们必须要抽象出一个员工概念
 * 抽象类的命名规范：
 * 普遍来说，公司里抽象类的命名： AbstractXxx
 *
 *
 *  - 请使用所学的知识设计该员工系统
 *  - 要求类中提供必要的方法进行属性访问（description）
 *  有两个子类的属性是一样的，这个方法可以复用的，这个方法写在哪里？
 *  写在父类里，写在抽象类中，需要写一个实现方法，让子类自己去选择
 *
 */
public class Demo {
    public static void main(String[] args) {
        //多态调用
        //AbstractStaff as;
        //as = new Staff();
        //as.work();
        //as = new Coder();
        ////程序员有独特的方法，需要强转，然后调用
        //if (as instanceof Coder){  //Condition 'as instanceof Coder' is always 'true'
        //    ((Coder) as).overtimeWork();
        //}
        //as.work();
        //as = new Manager();
        //if (as instanceof Manager){
        //    System.out.println(((Manager) as).bonus);
        //}
        //as.work();

        //创建对象
        Staff s = new Staff("张三", 18, 10000);
        s.printStaff();
        Coder c = new Coder("长风", 17, 20000);
        c.printStaff();
        Manager m = new Manager("李四", 38, 30000, 300000);
        m.printStaff();

    }
}

//抽象的员工类
abstract class AbstractStaff {
    String name;
    int age;
    double salary;

    public abstract void work();

    //实现方法，作为子类默认实现
    public void printStaff() {
        System.out.println("name=" + this.name + "\tage=" + this.age + "\tsalary=" + salary);
    }

    //构造方法
    public AbstractStaff(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public AbstractStaff() {
    }
}

class Staff extends AbstractStaff {

    @Override
    public void work() {
        System.out.println("我负责杂项工作");
    }

    public Staff() {
    }

    public Staff(String name, int age, double salary) {
        super(name, age, salary);
    }
}

class Coder extends AbstractStaff {

    @Override
    public void work() {
        System.out.println("我负责技术开发");
    }

    public void overtimeWork() {
        System.out.println("我喜欢加班，自愿加班，福报996");
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Coder() {
    }
}

class Manager extends AbstractStaff {

    double bonus; //独有的奖金属性

    @Override
    public void work() {
        System.out.println("我负责统筹规划");
    }

    @Override
    public void printStaff() {
        System.out.println("name=" + this.name + "\tage=" + this.age + "\tsalary=" + (salary+bonus));
    }

    public Manager() {
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }
}