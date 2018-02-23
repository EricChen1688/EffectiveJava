package com.eric.example.example1;

/**
 * @author Chen 2018/2/23
 */
public class PhoneService implements Service {
    @Override
    public boolean in() {
        System.out.println("手机刷卡进站");
        return false;
    }

    @Override
    public boolean out() {
        System.out.println("手机刷卡出站");
        return false;
    }
}
