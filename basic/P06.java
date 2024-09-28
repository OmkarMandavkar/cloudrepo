package com.basic;

//CONSTRUCTOR CHAINING

class test6 {
	int id, num;
	String name, color;

	public test6() {

	}

	public test6(int id) {
		this.id = id;
	}

	public test6(int id, int num) {
		this(id);
		this.num = num;
	}

	public test6(int id, int num, String name) {
		this(id, num);
		this.name = name;
	}

	public test6(int id, int num, String name, String color) {
		this(id, num, name);
		this.color = color;
	}

	public void disp() {
		System.out.println(id);
		System.out.println(num);
		System.out.println(name);
		System.out.println(color);
	}
}

public class P06 {
	public static void main(String[] args) {
		test6 x1 = new test6(5, 33);
		x1.disp();
	}
}
