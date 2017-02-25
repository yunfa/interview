package com.myself.common.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteClass {

    public static void removeList() {
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        for (String str : list1) {
            if ("B".equals(str)) {
                list1.remove(str);
            }
        }
        System.out.println(Arrays.toString(list1.toArray()));

        // transient 当对象被序列化时（写入字节序列到目标文件）时，transient阻止实例中那些用此关键字声明的变量持久化；
        // 当对象被反序列化时（从源文件读取字节序列进行重构），这样的实例变量值不会被持久化和恢复
        // Set<String> set = new CopyOnWriteArraySet<String>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String str : list) {
            if ("B".equals(str)) {
                // list.remove(str);
            }
        }
        // 这个是正确写法
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void main(String[] args) {
        removeList();
    }

}
