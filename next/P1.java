package com.next;

public class P1 {

	static {
		System.out.println("Block 1");
	}
	
	public static int x = 30;
	public static int y = 40;

	public static int add(int x, int y) {
		int res = x + y;
		System.out.println(res);
		return res;
	}

	static {
		System.out.println("Block 2");
	}

	public static void main(String[] args) {
		System.out.println(P1.x);
		System.out.println(P1.y);
		P1.add(1,2);
	}
}
