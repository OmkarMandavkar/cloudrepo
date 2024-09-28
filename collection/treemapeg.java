package com.collection;

import java.util.TreeMap;

public class treemapeg {
	public static void main(String[] args) {
		TreeMap<Integer, String> h1 = new TreeMap<>();
		
		h1.put(5, "ABC");
		h1.put(3, "QRH");
		h1.put(4, "ABC");
		h1.put(2, "QRH");
		
		System.out.println(h1);
		
		for(Integer x1 : h1.keySet()) {
			System.out.println(x1 + " " + h1.get(x1));
		}
	}
}
