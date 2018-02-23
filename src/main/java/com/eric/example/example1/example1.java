package com.eric.example.example1;

/**
 * @author Chen 2018/2/23
 */
public class example1 {
    /**
     * 类使用静态方法而不是共有的构造器提供实例
     */
    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
