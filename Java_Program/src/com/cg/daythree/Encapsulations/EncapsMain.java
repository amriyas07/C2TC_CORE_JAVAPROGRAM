package com.cg.daythree.Encapsulations;


public class EncapsMain {

	public static void main(String[] args) {
		EncapsulationDetails ed = new EncapsulationDetails();
		ed.setName("Riyas");
		ed.setMob(9087654321L);
		ed.setAge(20);
		System.out.println("Name : " + ed.getName());
		System.out.println("Mobile Number : " + ed.getMob());
		System.out.println("Age : " + ed.getAge());

	}

}
