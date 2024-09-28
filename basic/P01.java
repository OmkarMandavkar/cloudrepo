package com.basic;

//STATIC MEMBER

class test {

	static {
		System.out.println("Static 1");
	}

	public static int x = 20;

	public static void disp() {
		int x = 10;
		System.out.println("\n" + x);
		System.out.println(test.x);
	}

	static {
		System.out.println("Static 2");
	}

}

public class P01 {

	static {
		System.out.println("Static 3");
	}

	public static void main(String[] args) {

		System.out.println(test.x);
		test.disp();
	}
}
