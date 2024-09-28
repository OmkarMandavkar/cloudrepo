package com.basic;

class test5 {
	int id, num;
	String name;

	public test5() {

	}

	public test5(int id) {
		this.id = id;
	}

	public test5(int id, int num) {
		this.id = id;
		this.num = num;
	}

	public test5(int id, int num, String name) {
		this.id = id;
		this.num = num;
		this.name = name;
	}

	public void disp() {
		System.out.println(id);
		System.out.println(num);
		System.out.println(name);
	}
}

public class P05 {
	public static void main(String[] args) {
		test5 x1 = new test5();
		test5 x2 = new test5(1);
		test5 x3 = new test5(1, 22);
		test5 x4 = new test5(1, 22, "AVC");
		
		x1.disp();
		System.out.println();
		
		x2.disp();
		System.out.println();
		
		x3.disp();
		System.out.println();
		
		x4.disp();
		System.out.println();
	}
}
