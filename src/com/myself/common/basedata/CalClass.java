package com.myself.common.basedata;

import java.io.UnsupportedEncodingException;

public class CalClass {

    public static void baseConvert() {
        int a = 1;
        float b = 2f;
        a += b;
        // 编译报错
        // a=a+b
        System.out.println(a);
        double d = 3d;
        long l = 3l;
        // 编译报错
        // l=d;
        l = (long) d;
        d = l;
        System.out.println(d);
    }

    public static void baseSize() {
        // Byte 8
        System.out.println("Byte.SIZE:" + Byte.SIZE);
        // Short 16
        System.out.println("Short.SIZE:" + Short.SIZE);
        // Integer 32
        System.out.println("Integer.SIZE:" + Integer.SIZE);
        // Long 64
        System.out.println("Long.SIZE:" + Long.SIZE);
        // Float 32
        System.out.println("Float.SIZE:" + Float.SIZE);
        // Double 64
        System.out.println("Double.SIZE:" + Double.SIZE);
        // Character 16
        System.out.println("Character.SIZE:" + Character.SIZE);
    }

    public static void stringLeng() throws UnsupportedEncodingException {
        // 运行结果：2
        System.out.println("测试".getBytes("ISO8859-1").length);
        // 运行结果：4
        System.out.println("测试".getBytes("GB2312").length);
        // 运行结果：4
        System.out.println("测试".getBytes("GBK").length);
        // 运行结果：6
        System.out.println("测试".getBytes("UTF-8").length);
        // a 都是1
        System.out.println("a".getBytes("ISO8859-1").length);
        System.out.println("a".getBytes("GB2312").length);
        System.out.println("a".getBytes("GBK").length);
        System.out.println("a".getBytes("UTF-8").length);
    }

    public static void compareValue() {
        Integer a = 127;// 同 Integer.parseInt("127");
        Integer b = 127;
        // true
        System.out.println(a == b);
        a = new Integer(1);
        b = new Integer(1);
        // false
        System.out.println(a == b);
        // false
        System.out.println(3 * 0.1 == 0.3);
    }

    public static void main(String[] args) throws Exception {
        compareValue();
    }

}
