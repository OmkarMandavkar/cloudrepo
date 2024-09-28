package com.basic;

//	Multiple Inheritance

interface I1 {
	void method1();
}

interface I2 {
	void method1(); 
}

class test22 implements I1, I2{

	@Override
	public void method1() {
		System.out.println("Overriden");		
	}
}

public class P22 {
	public static void main(String[] args) {
		
		test22 x = new test22();
		x.method1();
		
		I1 i1 = x;
		i1.method1();

		I1 i2 = x;
		i2.method1();
	}
}
