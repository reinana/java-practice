package com.testtest;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Dog dog1 = new Dog("ラビのすけ");
		
		dog1.setCryCount(2);
		dog1.cry();
		dog1.sitDown();
		cat1.cry();
	}
}
