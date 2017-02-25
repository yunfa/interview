package com.myself.common.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveListValue implements Runnable {

    @Override
    public void run() {
        removeList2();
    }

    public void removeList1() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            if ("3".equals(it.next())) {
                it.remove();
            }
        }
        for (String str : list) {
            System.out.println("str:" + str);
        }
    }
    
    //这里单线不会有问题，但是多线程会报ConcurrentModificationException
    public void removeList2() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String str : list) {
            if ("3".equals(str)) {
                list.remove(str);
            }
        }
        for (String str : list) {
            System.out.println(str);
        }
    }

    public void removeList3() {
        List<String> list = new CopyOnWriteArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String str : list) {
            if ("3".equals(str)) {
                list.remove(str);
            }
        }
        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        RemoveListValue ro = new RemoveListValue();
        new Thread(ro).start();
        new Thread(ro).start();
        new Thread(ro).start();
        new Thread(ro).start();
    }

}
