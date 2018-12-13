package com.eric.example.java8.chapter04;



interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}
interface B extends A {
    default void hello() {
        System.out.println("Hello from B");
    }
}
class D implements A{ }

class C extends D implements B, A {
    public static void main(String... args) {
        new C().hello();
    }
}


public class DefaultMethod implements B, A {
    public static void main(String... args) {
        new DefaultMethod().hello();
    }
}

