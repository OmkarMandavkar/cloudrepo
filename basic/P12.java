package com.basic;

//	MULTILEVEL INHERITANCE

class M1 {
	int a1, a2;

	public M1(int a1, int a2) {
		this.a1 = a1;
		this.a2 = a2;
	}
}

class M2 extends M1 {
	int b1, b2;

	public M2(int a1, int a2, int b1, int b2) {
		super(a1, a2);
		this.b1 = b1;
		this.b2 = b2;
	}
}

class M3 extends M2 {
	int c1, c2;

	public M3(int a1, int a2, int b1, int b2, int c1, int c2) {
		super(a1, a2, b1, b2);
		this.c1 = c1;
		this.c2 = c2;
	}

	public void disp() {
		System.out.println(a1 + " " + a2 + " " + b1 + " " + b2 + " " + c1 + " " + c2);
	}
}

public class P12 {

	public static void main(String[] args) {
		M3 x = new M3(1, 2, 3, 4, 5, 6);
		x.disp();
	}
}
