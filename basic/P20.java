package com.basic;

// ABSTRACTION --> INTERFACE

interface Math {
	int add(int a, int b);

	int sub(int a, int b);

}

class set1 implements Math {

	@Override
	public int add(int a, int b) {
		int res = a + b;
		System.out.println("Result: " + res);
		return res;
	}

	@Override
	public int sub(int a, int b) {
		int res = a - b;
		System.out.println("Result: " + res);
		return res;
	}
}

public class P20 {
	public static void main(String[] args) {

		set1 s1 = new set1();
		s1.add(2, 6);
		s1.sub(7, 2);

	}
}
