package com.cg.daythree.constructors;


public class Constructors {
	static int a;
	static int b;
	static String name;
	Constructors(){
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		Constructors c = new Constructors();
		//System.out.println(c);
		c.a=10;
		c.b=20;
		c.name="Riyas";
		System.out.println("A = "+ a +" B ="+ b +" Name :"+name);
	}
	public Constructors(int a, int b, String name) {
		super();
		this.a = a;
		this.b = b;
		this.name = name;
		//System.out.println("A = "+a+"B ="+b+"Name :"+name);

	}

}
