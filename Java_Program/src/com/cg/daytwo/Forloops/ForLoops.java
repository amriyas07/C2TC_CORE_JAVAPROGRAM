package com.cg.daytwo.Forloops;
import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {
		int N;
		System.out.println("For Loops");
		for(int i=0;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		System.out.println("Nested For Loops");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Count : ");
		N = sc.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println("For Each Loops");
		int[] arr= {10,20,30,40,50};
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

}
