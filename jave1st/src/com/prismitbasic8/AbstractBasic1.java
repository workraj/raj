package com.prismitbasic8;

public abstract class AbstractBasic1 {
	abstract void work();
}
class HeroCycle extends AbstractBasic1 {
	void work(){
		System.out.println("selling good");
	}



	public static void main(String[] args) {
		AbstractBasic1 a= new HeroCycle();
		a.work();
		System.out.println("code ecxuted");

	
	}
}
