package com.next;

class Book {
	String title;
	int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
}

class Bag {
	String color;
	int height;
	Book b;

	public Bag(String color, int height, Book b) {
		this.color = color;
		this.height = height;
		this.b = b;
	}
}

public class P9 {
	public static void main(String[] args) {

		Book b1 = new Book("ABC", 776);
		Bag x1 = new Bag("Black", 66, b1);
		System.out.println(x1.color);
		System.out.println(x1.b.price);
	}
}
