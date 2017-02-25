package com.myself.common.baseclass;

public class StringClass {

    public static void main(String[] args) {
        // synchronized
        StringBuffer sb = new StringBuffer("StringBuffer是线程安全的");
        System.out.println(sb.toString());
        // not synchronized
        StringBuilder sbd = new StringBuilder("StringBuilder是线程不安全的");
        System.out.println(sbd.toString());
    }
}
