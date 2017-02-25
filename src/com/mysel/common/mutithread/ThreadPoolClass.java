package com.mysel.common.mutithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}

public class ThreadPoolClass {

    public static void main(String[] args) throws Exception {
        // 创建一个线程池对象，控制要创建几个线程对象。
        // public static ExecutorService newFixedThreadPool(int nThreads)
        ExecutorService pool = Executors.newFixedThreadPool(2);

        // 可以执行Runnable对象或者Callable对象代表的线程,Future表示任务执行结果
        Future<Object> future1 = pool.submit(new Callable<Object>() {

            @Override
            public Object call() throws Exception {
                System.out.println("callable...");
                return new Object();
            }
        });
        Future<Object> future2 = pool.submit(new Callable<Object>() {

            @Override
            public Object call() throws Exception {
                System.out.println("callable...");
                return new Object();
            }
        });
        Object obj1 = future1.get();
        Object obj2 = future2.get();
        System.out.println(obj1);
        System.out.println(obj2);
        // 结束线程池
        pool.shutdown();
    }
}