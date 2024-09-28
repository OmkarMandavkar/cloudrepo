package com.collection;

import java.util.HashMap;

public class hashmap1eg {
	public static void main(String[] args) {

		HashMap<Integer, String> h1 = new HashMap<>();
		h1.put(1, "ABC");
		h1.put(3, "QRH");
		h1.put(4, "ABC");
		h1.put(2, "QRH");
		
		System.out.println(h1);
		
		System.out.println(h1.get(3));
		
		System.out.println(h1.keySet());
		System.out.println(h1.entrySet());
		System.out.println(h1.values());
		
		System.out.println(h1.containsKey(3));
		
		for(Integer x1 : h1.keySet()) {
			System.out.println(x1 + " " + h1.get(x1));
		}
				
	}
}
