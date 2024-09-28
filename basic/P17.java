package com.basic;

//METHOD OVERRIDING

class test17{
	
	public void met1() {
		System.out.println("met 1");
	}
	
	public void met2() {
		System.out.println("met 2");
	}
	
	public void met3() {
		System.out.println("met 3");
	}
}

class test172 extends test17{
	public void method1() {
		System.out.println("method 1");
	}
	
	@Override
	public void met3() {
		System.out.println("method 3");
	}
}

public class P17 {
	public static void main(String[] args) {
		
		test172 x1 = new test172();
		x1.method1();
		x1.met3();
		
		test17 x2 = new test172();	//Upcasting
		x2.met1();
		x2.met2();
		x2.met3();
		
	}
}
