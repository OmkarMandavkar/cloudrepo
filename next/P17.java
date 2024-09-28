package com.next;

interface Bank1 {
	abstract void deposit();
	abstract void checkBalance();
}

interface Bank2 {
	abstract void deposit();
	abstract void checkBalance();
}

class SBI implements Bank1, Bank2 {
	@Override
	public void deposit() {
		System.out.println("SBI Deposit");
	}

	@Override
	public void checkBalance() {
		System.out.println("SBI Balance");
	}
}

public class P17 {
	public static void main(String[] args) {
		SBI x1 = new SBI();
		x1.deposit();
		x1.checkBalance();
	}
}
