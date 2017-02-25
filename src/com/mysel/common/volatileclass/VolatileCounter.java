package com.mysel.common.volatileclass;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 当一个变量定义为volatile之后，将具备两种特性： <br>
 * 1.保证此变量对所有的线程的可见性，这里的“可见性”，如本文开头所述，当一个线程修改了这个变量的值，新值对于其他线程是立即得知的。<br>
 * 但普通变量做不到这点，普通变量的值在线程间传递均需要通过主内存（详见：Java内存模型）来完成。<br>
 * 2.禁止指令重排序优化。有volatile修饰的变量，赋值后多执行了一个“load addl $0x0,(%esp)”操作<br>
 * ，这个操作相当于一个内存屏障（指令重排序时不能把后面的指令重排序到内存屏障之前的位置），只有一个CPU访问内存时，并不需要内存屏障；<br>
 * （什么是指令重排序：是指CPU采用了允许将多条指令不按程序规定的顺序分开发送给各相应电路单元处理）。
 */
public class VolatileCounter {

    // 使用volatile还是线程不安全的
    public static AtomicInteger count = new AtomicInteger(0);

    public static void inc() {
        // 这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        // 同时启动1000个线程，去进行i++计算，看看实际结果
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    VolatileCounter.inc();
                }
            }).start();
        }

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
        }
        // 这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + VolatileCounter.count.intValue());
    }
}
