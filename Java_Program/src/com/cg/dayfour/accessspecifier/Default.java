package com.cg.dayfour.accessspecifier;
// default Access Specifier
class Default {
	void print() {
		System.out.println("Riyas");
	}
	// Default is Same Package Level Access Only
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default d = new Default();
		d.print();
	}

}
