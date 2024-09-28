package com.next;

public class P5 {
	int x, y;
	String s;

	public P5(int x) {
		this.x = x;
	}

	public P5(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public P5(int x, int y, String s) {
		this.x = x;
		this.y = y;
		this.s = s;
	}

	public void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}

	public static void main(String[] args) {
		P5 x1 = new P5(1);
		x1.disp();
		
		P5 x2 = new P5(1, 2);
		x2.disp();
		
		P5 x3 = new P5(1, 4, "str");
		x3.disp();
	}
}
