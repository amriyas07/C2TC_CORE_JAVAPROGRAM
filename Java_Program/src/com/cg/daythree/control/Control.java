package com.cg.daythree.control;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For Loop");
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		int i=1;
		System.out.println("While Loop");
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println("Do-While");
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
	}

}
