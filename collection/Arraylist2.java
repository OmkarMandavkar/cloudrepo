package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product1 {
	String name, color;
	int id;

	public Product1(String name, String color, int id) {
		this.name = name;
		this.color = color;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class sortById implements Comparator<Product1>{
	
	@Override
	public int compare(Product1 p1, Product1 p2) {
		return p1.id - p2.id;
	}
}

class sortByColor implements Comparator<Product1>{
	
	@Override
	public int compare(Product1 p1, Product1 p2) {
		return p1.color.compareTo(p2.color);
	}
}

public class Arraylist2 {

	public static void main(String[] args) {
		
		ArrayList<Product1> a1 = new ArrayList<>();
		
		a1.add(new Product1("A", "Alack", 4));
		a1.add(new Product1("B", "Klack", 5));
		a1.add(new Product1("C", "Black", 2));
		
		Collections.sort(a1, new sortById());
		System.out.println(a1);
		
		Collections.sort(a1, new sortByColor());
		System.out.println(a1);
		
	}
}
