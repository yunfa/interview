package com.mysel.common.mutithread;

class ThreadJoin extends Thread {

    private String name;

    public ThreadJoin(String name) {
        super(name);
        this.name = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程" + name + "运行 : " + i);
            try {
                sleep((int) Math.random() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "主线程运行开始!");
        ThreadJoin mTh1 = new ThreadJoin("A");
        ThreadJoin mTh2 = new ThreadJoin("B");
        mTh1.start();
        mTh2.start();
        // join会等待线程执行完
        mTh1.join();
        System.out.println("mth1 join end ....");
        mTh2.join();
        System.out.println("mth2 join end ....");
        System.out.println(Thread.currentThread().getName() + "主线程运行结束!");
    }
}