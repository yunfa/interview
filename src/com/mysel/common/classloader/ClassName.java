package com.mysel.common.classloader;

public class ClassName extends ParentClass {

    public static void main(String[] args) {
        ClassName cn = new ClassName();
        System.out.println("Class.getName:" + cn.getClass().getName());
        System.out.println("Class.getSimpleName:" + cn.getClass().getSimpleName());
        System.out.println("Class.getSuperclass.getName:" + cn.getClass().getSuperclass().getName());
    }
}

class ParentClass {

    public ParentClass() {
        System.out.println("ParentClass");
    }

}