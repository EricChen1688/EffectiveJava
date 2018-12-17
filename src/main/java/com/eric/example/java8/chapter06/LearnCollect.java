package com.eric.example.java8.chapter06;

import com.eric.example.java8.chapter05.Dish;

import java.util.*;
import java.util.stream.Collectors;

// 对一个交易列表按货币分组，获得该货币的所有交易额总和（返回一个 Map<Currency,Integer> ）。
// 将交易列表分成两组：贵的和不贵的（返回一个 Map<Boolean, List<Transaction>> ）。
// 创建多级分组，比如按城市对交易分组，然后进一步按照贵或不贵分组（返回一个 Map<Boolean, List<Transaction>> ）
public class LearnCollect {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );

        List<Dish> collect = menu.stream().collect(Collectors.toList());

    }



}

class Currency {

}

class Transaction {
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
