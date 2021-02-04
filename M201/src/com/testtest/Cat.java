package com.testtest;

public class Cat {
	protected String name;
	protected int cryCount;
	
	public Cat() {
//		this.name = name;
	}
	public Cat(String name, int cryCount) {
		this.name = name;
		this.cryCount = cryCount;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCryCount(int cryCount) {
		this.cryCount = cryCount;
	}
	public void cry() {
		System.out.print(this.name + "「");
		for(int i=0; i<this.cryCount; i++) {
			System.out.print("ニャー");
		}
		System.out.print("」");
		System.out.println();
	}

}
