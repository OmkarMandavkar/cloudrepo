package com.next;

class p121 {
	String s;
	int a, b;

	public p121(String s, int a, int b) {
		this.s = s;
		this.a = a;
		this.b = b;
	}
}

class p122 extends p121 {
	int x;

	public p122(String s, int a, int b, int x) {
		super(s, a, b);
		this.x = x;
	}
}

public class P12 {
	public static void main(String[] args) {
		p121 x1 = new p122("QQQ", 1, 3, 5);

		p122 x2 = (p122) x1;

		System.out.println(x1.a);
		System.out.println(x1.s);
		System.out.println(x2.x);
	}
}
