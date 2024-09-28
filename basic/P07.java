package com.basic;

//	ENCAPSULATION

class test7 {

	String name;
	private String brand;

	public test7(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void disp() {
		System.out.println(name + " " + brand);
	}
}

public class P07 {

	public static void main(String[] args) {

		test7 x1 = new test7("A", "DH");
		x1.disp();
		System.out.println(x1.getBrand());
		x1.setBrand("QQQ");
		x1.disp();
	}
}
