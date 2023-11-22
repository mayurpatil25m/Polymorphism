package com.overloading;

public class overload {
	
	// Constructor (Always called before  methods)
	overload(){
		
		System.out.println("Mayur");
	}
	
	
	void m1() {
		System.out.println("Mayur Patil");
	}
	
	void m1(int a , int b) {
		int result = a + b ;
		
		System.out.println(result);
		
	}
	
	void m1(int a , int b , String c) {
		int result = a + b  ;
		
		System.out.println(result +   c);
	}
	
	
	
	

}
