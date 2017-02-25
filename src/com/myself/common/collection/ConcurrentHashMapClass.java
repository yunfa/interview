package com.myself.common.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClass {

    public static void main(String[] args) {
        // ConcurrentHashMap允许多个修改操作并发进行，其关键在于使用了锁分离技术,分为16个segment加锁，内容值很多的时候，性能比较好
        Map<String, String> conMaps = new ConcurrentHashMap<>();
        System.out.println("" + conMaps);
        Map<String, String> synMap = Collections.synchronizedMap(new HashMap<String, String>());
        System.out.println("" + synMap);
    }
}
