package com.next;

public class P13 {

	int a, b, c, d;

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {
		add(1, 2);
		add(1, 2, 3);
		add(1, 2, 3, 4);
	}
}
