package com.cg.daysix.statics;

public class Variable {
	static int a = 10,b;
	static {
		a=11;
	}
	Variable(){
		b=12;
		//System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable v = new Variable();
		System.out.println(a);
		System.out.println(b);
		

	}

}
