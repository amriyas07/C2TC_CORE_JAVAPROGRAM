package com.cg.daysix.finals;

public class FinalMethods {
	int a,b,c;
	public final int add(int a,int b) {
		c=a+b;
		System.out.println(c);
		return 0;
	}
	public static final int adds() {
		int a;
		a=10;
		a=12;
		System.out.println(++a);
		return 0;
	}

	public static void main(String[] args) {
		FinalMethods fm = new FinalMethods();
		fm.add(5, 2);
		FinalMethods.adds();
		
	}

}
