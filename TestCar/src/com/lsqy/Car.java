package com.lsqy;

class CarTest {
	private static int age = 10;
	public static String name = "xiaoming";
	
//	System.out.println("");
	public static void main(String[] args) {
		System.out.println(age);
		System.out.print(name);
	}
}

public class Car {
 
	public static void main(String[] args) {
//		System.out.println(CarTest.age);
		System.out.print(CarTest.name);
	}
}