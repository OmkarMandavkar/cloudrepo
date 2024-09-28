package com.basic;

// EXCEPTION HANDLING

public class P23 {
	public static void main(String[] args) {

//		System.out.println(9/0);
		try {
			System.out.println(9 / 0);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("Dividing by zero is not possible");
		}
		
		System.out.println("Block executed");
	}
}
