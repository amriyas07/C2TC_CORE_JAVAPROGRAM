package com.cg.dayfour.accessspecifier;

public class SpecPublic {
	public void print() {
		System.out.println("Mohamed");
	}
// Public Access Specifer is used in Same Package Level Access and Different Package also using  (Import that package using theat class).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecPublic sp = new SpecPublic();
		sp.print();

	}

}
