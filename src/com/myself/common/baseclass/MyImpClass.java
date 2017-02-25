package com.myself.common.baseclass;

abstract class MyAbstractClass {

	public int constInt = 5;

	// add code here
	public void method() {
		constInt = constInt + 4;
	}
}

public class MyImpClass extends MyAbstractClass {

	public static void main(String[] args) {
		MyImpClass cl = new MyImpClass();
		cl.constInt = cl.constInt + 4;
		System.out.println("const:" + cl.constInt);
	}

}