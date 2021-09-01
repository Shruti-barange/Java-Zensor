package com.basic;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.drive();
		Father f = new Father();
		f.drive();
	 }
}


class Father {
	void drive() {
		System.out.println("driving nano");
		}
}

class Son extends Father{
	void drive() {
		System.out.println("driving suzuki");
		
	}
}