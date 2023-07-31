package com.cg.daysix.finals;

public class Variable {
	static final double pi;
	static {
		pi=123.4456;
	}

	public static void main(String[] args) {
		final int a = 5,b;
		System.out.println(a);
		b=5;
		System.out.println(b);
		// Declaration
		final int c=5;
		System.out.println(pi);
		
		
		
	}

}
