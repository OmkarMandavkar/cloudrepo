package com.basic;

// PARA... CONSTRUCTOR

class test3 {
	String name, brand;
	int id;

	public test3(String name, String brand, int id) {
		this.name = name;
		this.brand = brand;
		this.id = id;
	}

	public void display() {
		System.out.println(name + " " + brand + " " + id);
	}

}

public class P03 {
	public static void main(String[] args) {
		test3 x1 = new test3("ABC", "XTS", 1223);
		x1.display();
		
		test3 x2 = new test3("23BC", "3TS", 1223);
		x2.display();
	}
}
