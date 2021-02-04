package com.testtest;

public class Dog {
	public String name;
	public int cryCount;
	public Dog(String name, int cryCount) {
		this.name = name;
		this.cryCount = cryCount;
		
	}
	public Dog(String name) {
		this.name = name;
		
	}
	public void cry() {
		System.out.println(this.name + "「");
		for(int i=0; i< this.cryCount; i++) {
			System.out.println("ワン");
		}
	}
	public void sitDown() {
		System.out.println(this.name +"はお座りしました");
	}
	public void setCryCount(int cryCount) {
		this.cryCount = cryCount;
	}

}
