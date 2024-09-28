package com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class pqueueeg1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> p1 = new PriorityQueue<>();
		
		p1.offer(20);
		p1.offer(20);
		p1.offer(30);
		p1.offer(10);
		
		
//		System.out.println(p1.poll());
		System.out.println(p1.peek());
		
		Iterator i =  p1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(p1);
	}
}
