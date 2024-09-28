package com.next;

class tester {
	public void add() {
		int a = 1, b = 29;
		int c = a + b;
		System.out.println("add1: " + c);
	}

	public void sub() {
		System.out.println("sub1");
	}
}

class test extends tester {

	@Override
	public void add() {
		int a = 1, b = 29;
		int c = a + b;
		System.out.println("add2: " + c);
	}
}

public class P14 {
	public static void main(String[] args) {
		test x1 = new test();
		x1.add();
	}

}
