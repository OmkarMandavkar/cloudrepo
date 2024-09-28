package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {
	String name, color;
	int id;

	public Product(String name, String color, int id) {
		this.name = name;
		this.color = color;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public int compareTo(Product p) {
		return name.compareTo(p.name);
	}
}

public class LinkedList1 {

	public static void main(String[] args) {
		
		ArrayList<Product> a1 = new ArrayList<>();
		
		a1.add(new Product("A", "Black", 4));
		a1.add(new Product("B", "Black", 5));
		a1.add(new Product("C", "Black", 2));
		
		Collections.sort(a1);
		
		System.out.println(a1);
		
	}
}
