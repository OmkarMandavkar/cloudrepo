package com.basic;

//	COMPOSITION --> DEPENDENT

class Engine {
	int engNum;
	int cc;

	public Engine(int engNum, int cc) {
		this.engNum = engNum;
		this.cc = cc;
	}

	public void start() {
		System.out.println("Engine Start");
	}
}

class Car {
	String brand, color;
	Engine e;

	public Car(String brand, String color, Engine e) {
		this.brand = brand;
		this.color = color;
		this.e = e;
	}
}

public class P09 {
	public static void main(String[] args) {

		Car c1 = new Car("BMW", "BLACK", new Engine(1234, 4000));

		System.out.println(c1.brand);
		System.out.println(c1.color);
		System.out.println(c1.e.cc);
		System.out.println(c1.e.engNum);
	}
}
