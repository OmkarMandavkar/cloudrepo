package com.next;

import java.util.Scanner;

class AgeLessThan18Exception extends RuntimeException{
	public AgeLessThan18Exception() {
		
	}
	public AgeLessThan18Exception(String message) {
		super(message);
	}
}

public class P18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("AGe: ");
		int age = sc.nextInt();
		
		if(age<18) {
			throw new AgeLessThan18Exception("Age should be more than 18");
		}
		else {
			System.out.println("Eligible");
		}
	}
}
