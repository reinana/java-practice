package com.testtest;

public class WiseDog extends Dog {
	
	public WiseDog(String name) {
		super(name);
	}
	public WiseDog(String name, int cryCount) {
		super(name, cryCount);
	}
	@Override
	public void cry() {
		System.out.print(this.name + "「");
		for(int i=0; i<this.cryCount; i++) {
			System.out.print("キャン");			
		}
		System.out.print("」");	
		System.out.println();
	}
	public void touch() {
		System.out.println(this.name +"はお手をしました");
	}

}
