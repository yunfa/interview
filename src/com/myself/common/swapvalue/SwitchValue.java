package com.myself.common.swapvalue;

public class SwitchValue extends Thread {

    public static void swapStringBuffer(StringBuffer a, StringBuffer b) {
        a.append(b);
        b = a;
        System.out.println("swap a.hashCode:" + a.hashCode());
        System.out.println("swap b.hashCode:" + b.hashCode());
    }

    public static void switchStringBufferPrint() {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        System.out.println("start a.hashCode:" + a.hashCode());
        System.out.println("start b.hashCode:" + b.hashCode());
        swapStringBuffer(a, b);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("end a.hashCode:" + a.hashCode());
        System.out.println("end b.hashCode:" + b.hashCode());
    }

    public static void swapString(String a, String b) {
        a = a + b;
        b = a;
    }

    public static void swapStringPrint() {
        String aa = new String("A");
        String bb = new String("B");
        swapString(aa, bb);
        System.out.println("aa:" + aa);
        System.out.println("bb:" + bb);
    }

    public static void swapArr(String[] a, String[] b) {
        a[0] = "1";
        b = a;
    }

    public static void swapArrPrint() {
        String[] a = new String[] { "A" };
        String[] b = new String[] { "B" };
        swapArr(a, b);
        System.out.println(a[0]);
        System.out.println(b[0]);
    }

    public static void swapInteger(Integer a, Integer b) {
        a = 11;
        b = a;
    }

    public static void swapIntegerPrint() {
        Integer a = 1;
        Integer b = 2;
        swapInteger(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        swapIntegerPrint();
    }

}
