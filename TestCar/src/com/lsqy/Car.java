package com.lsqy;

public class Car {
	private static int age = 10;
	public static String name = "xiaoming";
	
	public void move() {
		System.out.println("车可以开");
	}
//	System.out.println("");
	public static void main(String[] args) {
		System.out.println(age);
		System.out.print(name);
	}
}
