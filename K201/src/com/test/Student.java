package com.test;

public class Student {
	private String name;
	private int english;
	private int math;
	private int science;
	
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int english, int math, int science) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	public String getName() {
		return this.name;
	}
	public int getEnglish() {
		return this.english;
	}
	public int getmath() {
		return this.math;
	}
	public int getScience() {
		return this.science;
	}
	public static int getSum(Student student) {
		return student.getEnglish()+ student.getmath()+ student.getScience();
	}
	public static int getAverage(Student student) {
		return student.getSum(student) / 3;
	}
}
