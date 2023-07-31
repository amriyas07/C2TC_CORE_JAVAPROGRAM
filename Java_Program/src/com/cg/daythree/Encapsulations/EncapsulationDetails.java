package com.cg.daythree.Encapsulations;

public class EncapsulationDetails {
	private String Name;
	private long Mob;
	private int Age;
	public EncapsulationDetails() {
		super();
	}
	public EncapsulationDetails(String Name,long Mob,int Age) {
		this.Name=Name;
		this.Mob=Mob;
		this.Age=Age;
	}
	public String getName() {
		return Name;
	}
	public long getMob() {
		return Mob;
	}
	public int getAge() {
		return Age;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setMob(long Mob) {
		this.Mob=Mob;
	}
	public int setAge(int Age) {
		return this.Age=Age;
	}


}
