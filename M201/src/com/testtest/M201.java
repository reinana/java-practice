package com.testtest;

public class M201 {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("ミケ",4);
		WiseCat2 wiseCat1 = new WiseCat2();
		WiseCat2 wiseCat2 = new WiseCat2();
		wiseCat2.setName("タマ");
		wiseCat2.setCryCount(5);
		
		cat1.cry();
		cat2.cry();
		
		wiseCat1.cry();
		wiseCat2.cry();
		wiseCat1.lie();
		wiseCat2.lie();
		
		Dog dog1 = new Dog("ポチ");
		Dog dog2 = new Dog("クロ", 5);
		WiseDog wiseDog1 = new WiseDog("ラッキー");
		WiseDog wiseDog2 = new WiseDog("ハチ",10);
		
		dog1.cry();
		dog1.sitDown();
		dog2.cry();
		
		wiseDog1.cry();
		wiseDog1.sitDown();
		wiseDog1.touch();
		wiseDog2.cry();
		wiseDog2.sitDown();
		wiseDog2.touch();
		

	}

}
