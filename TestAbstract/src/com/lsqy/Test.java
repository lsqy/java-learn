package com.lsqy;

public class Test {
	
	public static void main(String[] args) {	
//		Father f = new Father(); 抽象类不能被实例化
		Son s = new Son();
		System.out.print(s.pay());
	}

}
