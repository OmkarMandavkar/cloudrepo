package com.basic;

//	NO-ARG CONSTRUCTOR

class test4 {
	int id, num;

	public test4() {
		System.out.println("CONS...");
	}

	public void disp() {
		System.out.println(id + " " + num);
	}
}

public class P04 {
	public static void main(String[] args) {
		test4 x1 = new test4();
		x1.id = 1;
		x1.num = 112;
		x1.disp();
	}
}
