package com.basic;

//	ABSTRACTION --> abstract classes

abstract class Vehicle {
	private String brand;

	public Vehicle(String brand) {
		this.brand = brand;
	}

	public abstract void drive();

	public void display() {
		System.out.println(brand);
	}
}

class Bike extends Vehicle {
	public Bike(String brand) {
		super(brand);
	}

	@Override
	public void drive() {
		System.out.println("Bike Drive");
	}
}

public class P19 {
	public static void main(String[] args) {
		Vehicle x1 = new Bike("Suzuki");
		x1.display();
		x1.drive();
	}
}
