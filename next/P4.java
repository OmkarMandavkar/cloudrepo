package com.next;

public class P4 {

	int x, y;

	public P4(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void disp() {
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		P4 x1 = new P4(1, 2);
		x1.disp();
	}
}
