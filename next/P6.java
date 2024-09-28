package com.next;

public class P6 {

	int x, y;
	String s;

	public P6(int x) {
		this.x = x;
	}

	public P6(int x, int y) {
		this(x);
		this.y = y;
	}

	public P6(int x, int y, String s) {
		this(x, y);
		this.s = s;
	}
	
	public void disp() {
		System.out.println(x + " " + y  + " " + s);
	}
	
	public static void main(String[] args) {
		P6 x1 = new P6(3, 8, "hfg");
		x1.disp();
	}
}
