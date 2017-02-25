package com.myself.common.executionsequence;

public class SequenceClass {

    {
        System.out.println("first{}");
    }

    {
        System.out.println("second{}");
    }

    static {
        System.out.println("first static{}");
    }

    static {
        System.out.println("second static{}");
    }

    public SequenceClass() {
        System.out.println("constructor");
    }

    public static void method() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        // SequenceClass cl = new SequenceClass();
        SequenceClass.method();
    }

}
