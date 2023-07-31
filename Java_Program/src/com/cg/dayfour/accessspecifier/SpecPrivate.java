package com.cg.dayfour.accessspecifier;

public class SpecPrivate {
	private void print() {
		System.out.println("DEEN");
	}
	// private is only Accessed in same class only..


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecPrivate sp = new  SpecPrivate();
		sp.print();

	}

}
