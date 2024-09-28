package com.collection;

import java.util.HashSet;

public class Hashseteg1 {

	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(null);
		h1.add(10);
		h1.add(90);
		h1.add(0);
		h1.add(70);
		h1.add(40);
		h1.add(10);
		
		h1.remove(0);
		
		System.out.println(h1.contains(null));
		
		System.out.println(h1.size());
		
		System.out.println(h1);
		
	}
}
