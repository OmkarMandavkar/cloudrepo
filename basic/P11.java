package com.basic;

//	SINGLE INHERITANCE

class c1 {
	int n1, n2;

	public c1(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

}

class c2 extends c1 {
	String color;

	public c2(int n1, int n2, String color) {
		super(n1, n2);
		this.color = color;
	}

	public void disp() {
		System.out.println(n1 + " " + n2 + " " + color);
	}
}

public class P11 {
	public static void main(String[] args) {

		c2 x = new c2(1, 2, "black");
		x.disp();

	}

}
