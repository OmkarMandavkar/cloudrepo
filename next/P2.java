package com.next;

public class P2 {

	{
		System.out.println("Block1");
	}

	int x = 10;
	int y = 30;

	public int add(int a, int b) {
		int res = a + b;
		System.out.println(res);
		return res;
	}

	{
		System.out.println("Block 2");
	}

	public static void main(String[] args) {
		P2 x1 = new P2();
		System.out.println(x1.x);
		System.out.println(x1.y);

		x1.add(1, 4);
	}
}
