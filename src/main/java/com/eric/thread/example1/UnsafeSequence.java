package com.eric.thread.example1;

/**
 * @author Chen 2018/2/24
 */
public class UnsafeSequence implements Runnable {
    private int value =0 ;

    public int getValue() {
        return value++;
    }

    @Override
    public void run() {
        System.out.println("线程-->"+Thread.currentThread().getName()+",value-->"+getValue());
    }

    public static void main(String[] args) {
        UnsafeSequence th1 = new UnsafeSequence();
        UnsafeSequence th2 = new UnsafeSequence();

        for (int i = 0;i<100 ;i++){
            th1.run();
            th2.run();
        }

    }
}


