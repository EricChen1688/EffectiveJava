package com.eric.example.java8;

/**
 * @author Chen 2018/12/2
 * @email 749829987@qq.com
 */
public class Lamada {

    public static void main(String[] args) {
        Lamada lamada = new Lamada();

        //类型声明：
        MathOperation addition = (int a , int b ) -> a+b;

        //不用类型声明
        MathOperation subtraction = (a, b) -> a-b;

        //大括号中返回语句

        MathOperation multiplication = (int a , int b) ->{
            a++;
            b++;
            return a*b;
        };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + lamada.operate(10, 5, addition));
        System.out.println("10 - 5 = " + lamada.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + lamada.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + lamada.operate(10, 5, division));


        GreetingService greetingService1 = (s)-> System.out.println("你好色彩"+s);
        greetingService1.sayMessage("牛逼");
        greetingService1.sayMessage("666");
    }


    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
