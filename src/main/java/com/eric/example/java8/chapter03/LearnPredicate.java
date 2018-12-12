package com.eric.example.java8.chapter03;

import com.eric.example.java8.chapter02.dto.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LearnPredicate {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("asdas", "", "12312");

        //定义一个Predicate ，这里是判断是否为空
        Predicate<String> nonEmptyStrringPredicate = (String s) -> !s.isEmpty();
        List<String> filter = filter(list, nonEmptyStrringPredicate);
        filter.forEach(System.out::println);

        List<Apple> appleList = Arrays.asList(new Apple("red", 123), new Apple("green", 12),new Apple("red", 12));
        Predicate<Apple> colorPredicate = (apple -> apple.getColor().equals("red"));
        Predicate<Apple> and = colorPredicate.and(apple -> apple.getWeight() > 120);

        List<Apple> apples = filter(appleList, and);
        apples.forEach(apple -> System.out.println(apple.getColor()));
    }

    /**
     * Predicate 接口定义了一个名叫test的抽象方法，它接受泛型T,并返回一个boolean
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        list.forEach(s -> {
            if (p.test(s))
                result.add(s);
        });
        return result;
    }
}
