package com.next;

import java.util.Objects;

class test15 {

	String name;
	int id, num;

	public test15(String name, int id, int num) {
		this.name = name;
		this.id = id;
		this.num = num;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		int n = Objects.hash(name, id, num);
		return n;
	}

	public boolean equals(Object o) {

		test15 z1 = (test15) o;

		if (z1.name == name && z1.id == id && z1.num == num) {
			return true;
		} else {
			return false;
		}
	}
}

public class P15 {
	public static void main(String[] args) {
		test15 x1 = new test15("ABC", 12, 998877);
		System.out.println(x1);
		System.out.println(x1.hashCode());

		System.out.println();
		test15 x2 = new test15("XYZ", 22, 668877);
		System.out.println(x2);
		System.out.println(x2.hashCode());

		System.out.println();
		test15 x3 = new test15("ABC", 12, 998877);
		System.out.println(x3.equals(x1));
	}
}
