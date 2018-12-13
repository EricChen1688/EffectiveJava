package com.eric.example.java8.chapter03;

import com.eric.example.java8.chapter02.dto.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReference {


    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("green", 155),
                new Apple("green", 80),
                new Apple("red", 120));
//        try01(inventory);
//        try02(inventory);
//        try03(inventory);
        try04(inventory);
    }

    /**
     * 第一次尝试，最常规的方案，自定义子类实现接口
     */
    public static void try01(List<Apple> inventory) {
        inventory.sort(new AppleComparator());
        System.out.println(inventory);
    }

    /**
     * 第二次尝试，使用匿名内部类
     */
    public static void try02(List<Apple> inventory) {
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        System.out.println(inventory);
    }

    /**
     * 第三次尝试，使用Lambda
     */
    public static void try03(List<Apple> inventory) {
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);
    }

    /**
     * 第四次尝试，使用Lambda
     */
    public static void try04(List<Apple> inventory) {
        inventory.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(inventory);
        //逆序
        inventory.sort(Comparator.comparing(Apple::getWeight)
                .reversed() //逆序
                .thenComparing(Apple::getColor));//根据color比较，比较器链，两个苹果一样重，根据颜色排序
    }
}

/**
 * 第一种解决方案，比较两个APPLE
 */
class AppleComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight() - o2.getWeight();
    }
}

