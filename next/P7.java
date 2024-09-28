package com.next;

class test1 {
	int x, y;

	public test1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class test2 extends test1 {
	String s;

	public test2(int x, int y, String s) {
		super(x, y);
		this.s = s;
	}

	public void disp() {
		System.out.println(x + " " + y + " " + s);
	}
}

public class P7 {
	public static void main(String[] args) {
		
		test2 x1= new test2(1, 3, "ehe");
		x1.disp();
	}
}
