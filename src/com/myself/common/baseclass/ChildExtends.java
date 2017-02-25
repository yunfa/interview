package com.myself.common.baseclass;

class People {

	String name;

	public People() {
		System.out.print(1);
	}

	public People(String name) {
		System.out.print(2);
		this.name = name;
	}
}

public class ChildExtends extends People {

	People father;

	public ChildExtends(String name) {
		// 默认调用super()
		System.out.print(3);
		this.name = name;
		father = new People(name + ":F");
	}

	public ChildExtends() {
		System.out.print(4);
	}

	public static void main(String[] args) {
		new ChildExtends("tom");
	}
}