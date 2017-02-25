package com.mysel.common.providerconsumer.my;

public class Storager {

    private int maxNum;

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int num) {
        maxNum = num;
    }

    public void addNum() {
        maxNum = maxNum + 1;
    }

    public void decNum() {
        maxNum = maxNum - 1;
    }

}