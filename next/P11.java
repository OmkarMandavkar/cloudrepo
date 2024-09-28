package com.next;

class p111 {
	String s;
	int a, b;

	public p111(String s, int a, int b) {
		this.s = s;
		this.a = a;
		this.b = b;
	}
}

class p112 extends p111 {
	int x;

	public p112(String s, int a, int b, int x) {
		super(s, a, b);
		this.x = x;
	}
}

public class P11 {
	public static void main(String[] args) {
		p111 x1 = new p112("QQQ", 1, 3, 5);
		System.out.println(x1.a);
		System.out.println(x1.s);
//		System.out.println(x1.x);
	}
}
