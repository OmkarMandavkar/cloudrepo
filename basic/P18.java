package com.basic;

import java.util.Objects;

//	OVERRIDE TOSTRING(), HASHCODE(), EQUALS()

class Laptop {
	String name, color;
	int price;

	public Laptop(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		int n = Objects.hash(name, color, price);
		return n;
	}

	@Override
	public boolean equals(Object o) {
		Laptop l = (Laptop) o;

		if (name == l.name && color == l.color && price == l.price) {
			return true;
		} else {
			return false;
		}
	}
}

public class P18 {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Asus", "Black", 10000);
		Laptop l2 = new Laptop("Dell", "White", 70000);
		Laptop l3 = new Laptop("Asus", "Black", 10000);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

		System.out.println();
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
		System.out.println(l3.hashCode());

		System.out.println();
		System.out.println(l1 == l3);	//compares address
		System.out.println(l1.equals(l3));	//compares states

	}
}
