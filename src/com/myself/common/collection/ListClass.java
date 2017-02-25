package com.myself.common.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class ListClass {

    @SuppressWarnings({ "rawtypes", "unused", "unchecked" })
    public static void main(String[] args) {
        // Collection->List,Set,Queue
        List list1 = new ArrayList();
        List list2 = new LinkedList();
        List vector = new Vector();
        List stack = new Stack();
        Set sets1 = new HashSet();
        Set sets2 = new TreeSet<>();
        Queue queue = new LinkedBlockingQueue<>();
        // Map
        Map maps1 = new HashMap();
        maps1.put(null, null);
        Map maps2 = new Hashtable<>();
        // maps2.put(1, 1);
        Map maps3 = new WeakHashMap();
    }
}
