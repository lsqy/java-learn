package com.test;

public class NestFor {
	// 1 2 3 4
	// 2 2 3 4
	// 3 2 3 4
	// 4 2 3 4
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			System.out.print(i+" ");
			for(int j = 2; j <= 4; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
