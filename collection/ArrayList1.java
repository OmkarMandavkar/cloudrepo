package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(2, 40);
		a1.add(10);
		
		System.out.println(a1);
		
		a1.remove(3);
		System.out.println(a1);
		
		System.out.println(a1.get(3));
		
		System.out.println(a1);
		System.out.println(a1.indexOf(20));
		
		System.out.println(a1.lastIndexOf(10));
		
		System.out.println(a1.size());
		
		Iterator<Integer> i = a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
