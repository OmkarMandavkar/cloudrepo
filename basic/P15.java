package com.basic;

//	GENERALIZATION

class Sim {
	String name;
	int price;

	public Sim(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void disp() {
		System.out.println(name + " " + price);
	}
}

class Airtel extends Sim {
//	String name;
//	int price;

	String color;

	public Airtel(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	public void disp1() {
		System.out.println(name + " " + price);
	}
}

class Jio extends Sim {

	public Jio(String name, int price) {
		super(name, price);
	}

	public void disp2() {
		System.out.println(name + " " + price);
	}
}

public class P15 {
	public static void main(String[] args) {
		Sim s = new Airtel("Airtel", 1000, "Red");
		System.out.println(s.name);
		System.out.println(s.price);
//		System.out.println(s.color);	CTE
		
		Airtel a = (Airtel)s;		//Downcasting
		System.out.println(a.color);
	}
}
