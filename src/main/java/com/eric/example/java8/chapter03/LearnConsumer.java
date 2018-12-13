package com.eric.example.java8.chapter03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 */
public class LearnConsumer {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("asdas", "", "12312");

        TestConsumer.forEach(list,s -> {
            System.out.println(s);
        });
        list.forEach(s -> {
            s = s + "1";
            System.out.println(s);
        });
    }

}

class TestConsumer {

    public static <T> void forEach(List<T> list, Consumer<T> c){
        for(T i: list){
            c.accept(i);
        }
    }
}