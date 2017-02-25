package com.mysel.common.mutithread;

public class ThreadGroupClass {

    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("group1111");
        Thread t1 = new Thread(g1, new Runnable() {

            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("thread end...");
                } catch (InterruptedException e) {
                }
            }
        }, "thread11111");
        t1.setDaemon(false);
        t1.start();
        // t1.interrupt();
        Thread[] list = new Thread[10];
        t1.getThreadGroup().enumerate(list);
        if (list != null) {
            System.out.println(list[0].getName());
            // 可以通过线程组获得其中线程并提前终止
            list[0].interrupt();
        }
        // System.out.println("active count:" + t1.getThreadGroup().activeCount());
        g1.list();
        System.out.println("main end...");
    }
}
