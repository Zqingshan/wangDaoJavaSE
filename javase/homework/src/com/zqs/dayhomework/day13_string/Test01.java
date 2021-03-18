package com.zqs.dayhomework.day13_string;

/**
 * @description: 第一题
 * @author: z_qingshan
 * @create: 2021-03-15
 **/

import java.util.Arrays;
import java.util.Comparator;

/**
 * 编写一个Cat类
 * 成员变量：
 * int age
 * String name
 * double price
 * <p>
 * 1，实现Comparable接口，按照年龄的从小到大对Cat数组进行自然排序
 * <p>
 * 2，利用Comparator接口，用 匿名内部类和lambda分别对Cat数组进行自然排序
 * 1，按照price的大到小排序
 * 2，name的长短排序，name越长对象越大
 * 3，综合age，name，price进行排序，要求用lambda表达式指向一个方法。
 * 排序的规则是age越小对象越小，age相同比较name长短，name越短对象越小，name长度也相等，比较price，price越大对象越小
 */
public class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat c1 = new Cat(1, "La", 4500);
        Cat c2 = new Cat(1, "To", 2000);
        Cat c3 = new Cat(1, "Ja", 5500);
        Cat c4 = new Cat(1, "Kk", 1000);
        Cat[] arr = {c1, c2, c3, c4};
        cat.getInfo(arr);

        //按照价格从大到小排序
        /*Arrays.sort(arr, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return ((int) (o2.price - o1.price));
            }
        });
        //Lambda表达式
        Arrays.sort(arr,(o1,o2)->
            ((int) (o2.price - o1.price))
        );*/

        //name的长短排序，name越长对象越大
        /*Arrays.sort(arr, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.name.length() - o2.name.length();
            }
        });*/

        //综合排序
        Sort sort = new Sort();
        Arrays.sort(arr, sort::compare);

        System.out.println("================================");
        cat.getInfo(arr);
    }
}

class Cat implements Comparable {
    int age;
    String name;
    double price;

    public Cat() {
    }

    public Cat(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }


    @Override
    public int compareTo(Object o) {
        // 按照年龄的从小到大对Cat数组进行自然排序
        Cat compareCat = (Cat) o;
        return this.age - compareCat.age;
    }

    public static void getInfo(Cat[] cat) {
        for (int i = 0; i < cat.length; i++) {
            System.out.println("age=" + cat[i].age + "，name=" + cat[i].name + "，price=" + cat[i].price);
        }
    }
}

class Sort implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (((Cat) o1).age != ((Cat) o2).age) {
            return ((Cat) o1).age - ((Cat) o2).age;
        } else {
            if (((Cat) o1).name.length() != ((Cat) o2).name.length()) {
                return ((Cat) o1).name.length() - ((Cat) o2).name.length();
            } else {
                return ((int) (((Cat) o1).price - ((Cat) o2).price));
            }
        }
    }
}