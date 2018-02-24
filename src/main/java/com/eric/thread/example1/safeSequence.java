package com.eric.thread.example1;

/**
 * @author Chen 2018/2/24
 */
public class safeSequence implements Runnable {
    private String threadName;
    private int value =0 ;

    public synchronized int getValue() {
        return value++;
    }

    public safeSequence(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0;i<100 ;i++) {
            System.out.println("线程-->" +getThreadName() + ",value-->" + getValue());
        }
    }

    public static void main(String[] args) {
        safeSequence th1 = new safeSequence("niubi");
        safeSequence th2 = new safeSequence("niubi2");
        th1.run();
        th2.run();
    }
}


