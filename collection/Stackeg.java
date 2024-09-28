package com.collection;


import java.util.Stack;

public class Stackeg {
	
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		
		s1.push(11);
		s1.push(19);
		s1.push(1);
		s1.push(10);
		s1.push(33);
		
		s1.pop();
		
		System.out.println(s1.peek());
		
		System.out.println(s1.size());
		
		System.out.println(s1.contains(10));
		
		System.out.println(s1.search(91));
		System.out.println(s1);
		
	}
}
