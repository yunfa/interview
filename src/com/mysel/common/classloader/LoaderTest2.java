package com.mysel.common.classloader;

public class LoaderTest2 {

    static {
        System.out.println("静态初始化块执行了！");
    }

    {
        System.out.println("初始化块执行了！");
    }

    public LoaderTest2() {
        System.out.println("Construction执行了");
    }

    public void method1() {
        System.out.println("method1执行了");
    }

    public static void method2() {
        System.out.println("method2执行了");
    }
}