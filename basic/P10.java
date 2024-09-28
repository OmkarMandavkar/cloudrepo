package com.basic;

//	AGGREGATION --> NOT DEPENDENT

class Book {
	String title, author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void dispBook() {
		System.out.println(title);
		System.out.println(author);
	}
}

class Bag {
	String color;
	int price;
	Book b;

	public Bag(String color, int price) {
		this.color = color;
		this.price = price;
//		this.b = b;
	}

	public void dispBook() {
		System.out.println(color);
		System.out.println(price);
//		b.dispBook();
	}
}

public class P10 {
	public static void main(String[] args) {

		Bag b1 = new Bag("black", 1240);
		b1.dispBook();
	}
}
