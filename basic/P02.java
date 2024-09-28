package com.basic;

//NON-STATIC MEMBER

class test2 {
	int x;
	{
		System.out.println("block 1");
	}

	public void disp() {
		System.out.println(x);

	}

	{
		System.out.println("block 2");
	}
	
	{
		System.out.println("block 3");
	}

}

public class P02 {
	public static void main(String[] args) {

		test2 x1 = new test2();
		x1.x = 20;
		x1.disp();

	}

}
