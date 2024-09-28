package com.next;

class multi1 {
	int x, y;

	public multi1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class multi2 extends multi1 {
	int q;

	public multi2(int x, int y, int q) {
		super(x, y);
		this.q = q;
	}
}

class multi3 extends multi1 {
	int s;

	public multi3(int x, int y, int s) {
		super(x, y);
		this.s = s;
	}

	public void disp() {
		System.out.println(x + " " + y + " " + s);
	}
}

public class P10 {
	public static void main(String[] args) {
		multi3 x1 = new multi3(2, 2, 6);
		x1.disp();
		
		multi2 x2 = new multi2(2, 2, 2);
	}
}
