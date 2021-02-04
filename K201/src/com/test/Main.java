package com.test;

public class Main {
	public static void main(String[] args) {
		Student[] students = {
				new Student("山田", 65,70,60),
				new Student("田中", 50, 55, 75),
				new Student("鈴木", 70, 70, 65),
				new Student("佐藤", 40, 45, 85),
				new Student("小林", 80, 55, 90),
		};
		
		for(int i=0; i<students.length; i++) {
			System.out.print(""+students[i].getName() + "さんは");
			System.out.print(""+students[i]);
			System.out.println("英語" + students[i].getEnglish()+"点");
			System.out.println();
			System.out.println("合計は"+Student.getSum(students[i])+"点");
			System.out.println("平均は"+Student.getAverage(students[i]));
		}
		
		System.out.println(""+students);
		
		
		
		
	}
}
