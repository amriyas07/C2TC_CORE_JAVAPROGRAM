package com.cg.daytwo.whiles;

public class WhileandDo {

	public static void main(String[] args) {
		int i=0;
		System.out.println("While");
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Do-While");
		do {
			System.out.println(i);
			i++;
		}while(i<=10);

	}

}
