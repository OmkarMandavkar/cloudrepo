package com.next;

public class P8 {
	private String name, color;
	private int id, phn;

	public P8(String name, String color, int id, int phn) {
		this.name = name;
		this.color = color;
		this.id = id;
		this.phn = phn;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPhn() {
		return phn;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPhn(int phn) {
		this.phn = phn;
	}

	public void disp() {
		System.out.println(name + " " + color + " " + id + " " + phn);
		System.out.println();
	}

	public static void main(String[] args) {

		P8 x1 = new P8("Omkar", "Black", 1, 9988);
		x1.disp();
		System.out.println(x1.getName());
		System.out.println(x1.getColor());

		x1.setId(888);
		x1.setPhn(998877);
		System.out.println();
		x1.disp();


	}
}
