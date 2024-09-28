package com.next;

abstract class test16 {
	public abstract void disp();

	public void vehicle() {
		System.out.println("vehicle class");
	}
}

class vehicle extends test16 {
	public void disp() {
		System.out.println("Class Implemented");
	}

	public void car3() {
		System.out.println("car class");
	}
}

public class P16 {
	public static void main(String[] args) {

		test16 x1 = new vehicle();
		x1.disp();
		x1.vehicle();
//		x1.car3();

		vehicle x2 = (vehicle) x1;
		x2.car3();
	}
}
