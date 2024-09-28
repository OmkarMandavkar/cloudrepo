package com.basic;

//	METHOD OVERLOADING

class test16{
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
}


public class P16 {
	public static void main(String[] args) {
		
		test16 x1 = new test16();
		int p = x1.add(3, 2);
		System.out.println(p);
		
		test16 x2 = new test16();
		int h = x2.add(2, 7, 8);
		System.out.println(h);
		
		test16 x3 = new test16();
		int i = x3.add(5, 4, 8, 5);
		System.out.println(i);
	}
}
