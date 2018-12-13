package com.eric.example.java8.chapter03;

import com.eric.example.java8.chapter02.dto.Apple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * Function<T,R> 输入T ,返回R类型
 */
public class LearnFunction {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("green", 155),
                new Apple("green", 80),
                new Apple("red", 120));


        List<String> strings = Arrays.asList("123", "456", "789");
        Function<List<Apple>, Map<String, Apple>> function = list -> {
            Map<String, Apple> map = new HashMap<>();
            list.forEach(apple -> {
                map.put(apple.getColor(), apple);
            });
            return map;
        };
        Map<String, Apple> apply = function.apply(inventory);
        System.out.println(apply);
    }


}

