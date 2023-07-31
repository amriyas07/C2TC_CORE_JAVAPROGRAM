package com.cg.daythree.Scanners;
import java.util.Scanner;

public class ScannersInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number1,Number2;
		String Name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		Number1 = sc.nextInt();
		System.out.println("\n");
		System.out.print("Enter Number 2 : ");
		Number2 = sc.nextInt();
		System.out.println("\n");
		System.out.println("Enter Your Name : ");
		Name = sc.next();
		System.out.println("\n");
		System.out.println("Your Name is  : "+Name+" and You have Enter Two Numbers that is "+Number1+" and "+Number2);
		
		

	}

}
