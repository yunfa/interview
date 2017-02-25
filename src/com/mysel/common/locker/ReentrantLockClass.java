package com.mysel.common.locker;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/**
 * ReentrantLock性能在更多线程时性能更好
 */
public class ReentrantLockClass {

    private Map<Integer, String> map = new HashMap<Integer, String>();

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private ReadLock readLock = lock.readLock();

    private WriteLock writeLock = lock.writeLock();

    public String getResult(Integer key) {
        readLock.lock();
        try {
            // 读锁里面不能再有写锁
            // putMap(key, "bbb");
            return map.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public void putMap(Integer key, String value) {
        writeLock.lock();
        try {
            map.put(key, value);
            // 写锁里面可以有读锁
            System.out.println(getResult(key));
        } finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockClass rl = new ReentrantLockClass();
        rl.putMap(1, "aaaa");
        System.out.println(rl.getResult(1));
    }
}
