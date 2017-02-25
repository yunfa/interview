package com.mysel.common.providerconsumer.my;

public class Provider implements Runnable {

    private Storager storager = new Storager();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            storager.addNum();
        }
    }

}
