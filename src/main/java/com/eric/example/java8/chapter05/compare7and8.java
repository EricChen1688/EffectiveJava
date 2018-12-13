package com.eric.example.java8.chapter05;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class compare7and8 {

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

//        lowCaloricDishesInJava7(menu);
        lowCaloricDishesInJava8(menu);
    }

    private static void lowCaloricDishesInJava8(List<Dish> menu) {
        List<String> lowCaloricDishes = menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());

        /**
         * 并行
         */
        List<String> parallelLowCaloricDishes = menu.parallelStream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
        System.out.println(parallelLowCaloricDishes);

    }

    private static void lowCaloricDishesInJava7(List<Dish> menu) {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        //用累加器筛选元素
        for(Dish d: menu){
            if(d.getCalories() < 400){
                lowCaloricDishes.add(d);
            }
        }
        //用匿名类对菜肴排序
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            public int compare(Dish d1, Dish d2){
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });
        List<String> lowCaloricDishesName = new ArrayList<>();
        for(Dish d: lowCaloricDishes){
            lowCaloricDishesName.add(d.getName());
        }
        System.out.println(lowCaloricDishes);
    }


}
