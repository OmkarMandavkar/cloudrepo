package com.basic;

//	UPCASTING

class Car1 {
	String name, color;

	public Car1(String name, String color) {
		this.name = name;
		this.color = color;
	}
}

class Merc extends Car1 {
	int cc;

	public Merc(String name, String color, int cc) {
		super(name, color);
		this.cc = cc;
	}
}

class Bmw extends Car1 {
	int mileage;
	
	public Bmw(String name, String color, int mileage) {
		super(name, color);
		this.mileage = mileage;
	}
}

class Audi extends Car1 {
	public Audi(String name, String color) {
		super(name, color);
	}
}

public class P14 {
	public static void main(String[] args) {

		Car1 x1 = new Merc("Merc", "Black", 11);
		System.out.println(x1.name);
		System.out.println(x1.color);
//		System.out.println(x1.cc);	CTE

		Car1 x2 = new Bmw("Bmw", "Black", 4000);
		System.out.println(x2.name);
		System.out.println(x2.color);

		Car1 x3 = new Audi("Audi", "Black");
		System.out.println(x3.name);
		System.out.println(x3.color);
	}
}
