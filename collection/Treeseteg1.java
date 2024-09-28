package com.collection;

import java.util.TreeSet;

public class Treeseteg1 {
	public static void main(String[] args) {

		TreeSet<Integer> t1 = new TreeSet<>();

		t1.add(10);
//		t1.add(null);
		t1.add(60);
		t1.add(30);
		t1.add(10);

		System.out.println(t1.contains(10));

		System.out.println(t1.size());

		System.out.println(t1.size());
		
		System.out.println(t1);
	}
}
