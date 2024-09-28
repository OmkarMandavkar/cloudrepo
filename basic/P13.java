package com.basic;

//	HIERARCHIAL INHERITANCE

class base {
	int n1, n2;

	public base(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

}

class hie1 extends base {
	int n3;

	public hie1(int n1, int n2, int n3) {
		super(n1, n2);
		this.n3 = n3;
	}

	public void disp1() {
		System.out.println(n1 + n2 + n3);
	}
}

class hie2 extends base {
	int n4;

	public hie2(int n1, int n2, int n4) {
		super(n1, n2);
		this.n4 = n4;
	}

	public void disp2() {
		System.out.println(n1 + n2 + n4);
	}
}

class hie3 extends base {
	int n5;

	public hie3(int n1, int n2, int n5) {
		super(n1, n2);
		this.n5 = n5;
	}

	public void disp3() {
		System.out.println(n1 + n2 + n5);
	}
}

class itr extends hie3 {
	String str;

	public itr(int n1, int n2, int n5, String str) {
		super(n1, n2, n5);
		this.str = str;
	}
}

public class P13 {
	public static void main(String[] args) {

		hie1 x1 = new hie1(1, 2, 3);		
		hie2 x2 = new hie2(4, 5, 8);
		hie3 x3 = new hie3(4, 9, 4);
		
		x1.disp1();
		x2.disp2();
		x3.disp3();
	}
	
}
