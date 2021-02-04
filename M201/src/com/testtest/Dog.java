package com.testtest;

public class Dog {
	protected String name;
	protected int cryCount;
	
	public Dog(String name) {
		this.name = name;
	}
	public Dog(String name, int cryCount) {
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
			System.out.print("ワン");			
		}
		System.out.print("」");	
		System.out.println();
	
	}
	public void sitDown() {
		System.out.println(this.name + "は座りました");
	}
}
