package com.collection;

import java.util.LinkedHashSet;

public class Linkekhasheg1 {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> h1 = new LinkedHashSet<>();
		h1.add(29);
		h1.add(null);
		h1.add(29);
		h1.add(30);
		h1.add(10);
		h1.add(90);
		
		h1.remove(10);
		
		System.out.println(h1.contains(30));
		
		
		System.out.println(h1);
	}
}
