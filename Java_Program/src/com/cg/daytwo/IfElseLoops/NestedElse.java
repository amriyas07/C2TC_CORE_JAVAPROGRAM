package com.cg.daytwo.IfElseLoops;
import java.util.Scanner;
public class NestedElse {

	public static void main(String[] args) {
		  int n;
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Number : ");
		  n=sc.nextInt();
		  System.out.println("\n");
		  if (n % 2 == 0) {
		    System.out.println("Even ");
		    if (n % 4 == 0) {
		      System.out.println("and divisible by 4");
		    } 
		    else {
		      System.out.println("and not divisible by 4");
		    }
		    
		  } 
		  
		  else {
		    System.out.println("Odd ");

		    if (n % 3 == 0) {
		      System.out.println("and divisible by 3");
		    }
		    
		    else {
		      System.out.println("and not divisible by 3");
		    }

		  }



	}

}
