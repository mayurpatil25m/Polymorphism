package com.overriding;

public class B extends A {
	
	void m4() {
		System.out.println("Method m4 of class B");
	}
	
	@Override
	void m2() {
		System.out.println("Method m2 of class B");
	}

}
