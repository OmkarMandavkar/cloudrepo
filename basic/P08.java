package com.basic;

//	ENCAPSULATION
class test8 {
	private int id, phn;
	private String fname;
	String lname;

	public test8() {

	}

	public test8(int id) {
		this.id = id;
	}

	public test8(int id, int phn) {
		this(id);
		this.phn = phn;
	}

	public test8(int id, int phn, String fname) {
		this(id, phn);
		this.fname = fname;
	}

	public test8(int id, int phn, String fname, String lname) {
		this(id, phn, fname);
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPhn(int phn) {
		this.phn = phn;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void disp() {
		System.out.println(id + " " + phn + " " + fname + " " + lname);
	}
}

public class P08 {
	public static void main(String[] args) {

		test8 x1 = new test8(1, 2222, "Omkar", "ABCS");
		x1.disp();

		System.out.println(x1.getId());

		x1.setFname("Krypto");
		x1.disp();

	}
}
