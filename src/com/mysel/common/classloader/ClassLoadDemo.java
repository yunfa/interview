package com.mysel.common.classloader;

public class ClassLoadDemo {

    public static void classParentMethod() {
        ClassLoadDemo demo = new ClassLoadDemo();
        Class<? extends ClassLoadDemo> cls = demo.getClass();
        ClassLoader loader = cls.getClassLoader();
        System.out.println("First Class Loader:" + loader);
        System.out.println("Parent Class Loader:" + loader.getParent());
        System.out.println("Parent2 Class Loader:" + loader.getParent().getParent());
    }

    public static void classLoaderMethod() throws Exception {
        ClassLoader loader = ClassLoadDemo.class.getClassLoader();
        System.out.println(loader);
        // 使用ClassLoader.loadClass()来加载类，不会执行初始化块
        // Test2 t2 = (Test2) loader.loadClass("com.mysel.common.classloader.LoaderTest2").newInstance();
        // t2.method1();
        // 使用Class.forName()来加载类，默认会执行初始化块
        System.out.println("------------newTest------------");

        System.out.println("------------forNameClass1------------");
        Class<?> forNameClass1 = Class.forName("com.mysel.common.classloader.LoaderTest2");
        forNameClass1.getMethod("method1").invoke(forNameClass1.newInstance());
        // 使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块
        System.out.println("------------forNameClass2------------");
        Class<?> forNameClass2 = Class.forName("com.mysel.common.classloader.LoaderTest2", false, loader);
        forNameClass2.getMethod("method1").invoke(forNameClass2.newInstance());
    }

    public static void invokeSort() {
        // Test2 t2 = new Test2();
        // t2.method1();
        // Test2 t3 = new Test2();
        LoaderTest2.method2();
        LoaderTest2.method2();
    }

    public static void main(String[] args) throws Exception {
        // classParentMethod();
        // classLoaderMethod();
        // invokeSort();
        Integer l1 = 127;
        Integer l2 = 127;
        System.out.println(l1 == l2);
        String s1 = new String("s");
        String s2 = new String("s");
        System.out.println(s1 == s2);
    }
}
