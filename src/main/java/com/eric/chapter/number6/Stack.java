package com.eric.chapter.number6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author Chen 2018/12/5
 * @email 749829987@qq.com
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INTIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INTIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }

    //确保有足够的空间添加一个新的元素
    private void ensureCapacity(){
        if (elements.length == size)
            elements = Arrays.copyOf(elements,2 * size + 1);
    }
}
