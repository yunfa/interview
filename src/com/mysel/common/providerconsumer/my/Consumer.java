package com.mysel.common.providerconsumer.my;

public class Consumer implements Runnable {

    private ThreadLocal<Storager> localStorager = new ThreadLocal<Storager>();

    @Override
    public void run() {
        Storager storager = localStorager.get();
        if (storager == null) {
            storager = new Storager();
            System.out.println("init max num.");
            storager.setMaxNum(100);
        }
        while (storager.getMaxNum() > 0) {
            storager.decNum();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程名:" + Thread.currentThread().getName() + ",当前库存:" + storager.getMaxNum());
        }
    }

    public static void main(String[] args) {
        // Storager.localMaxNum.set(100);
        Consumer c1 = new Consumer();
        // Consumer c2 = new Consumer();
        new Thread(c1).start();
        new Thread(c1).start();
        // new Thread(c2).start();
    }
}
