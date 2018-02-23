package com.eric.example.example1;

/**
 * @author Chen 2018/2/23
 */
public class CardService implements Service {
    @Override
    public boolean in() {
        System.out.println("通过一卡通进入地铁");
        return false;
    }

    @Override
    public boolean out() {
        System.out.println("通过一卡通出地铁");
        return false;
    }
}
