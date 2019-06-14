package com.lsqy;

public class TestCar {
	
	private static int age = 10;
	public static String name = "xiaoming";

	public static void main(String[] args) {
		Car c = new Car();
		c.move();
		System.out.println(age);
		System.out.print(name);
	}
}

