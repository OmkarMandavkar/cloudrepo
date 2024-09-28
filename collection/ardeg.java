package com.collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ardeg {

	public static void main(String[] args) {

		ArrayDeque<Integer> p1 = new ArrayDeque<>();

		p1.offer(20);
		p1.offer(20);
		p1.offer(30);
		p1.offer(10);
		p1.offerFirst(80);
		p1.offerLast(70);
		System.out.println(p1);

		System.out.println("pool " + p1.pollLast());
		System.out.println(p1);

		System.out.println("peek " + p1.peekFirst());

		Iterator i = p1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println(p1);
	}
}
