package com.lsqy;

public class Animal {

	private int weight;
	
	public void setWeight(int w) {
		weight = w;
		System.out.println("������������Ϊ" + w);
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void eat() {
		System.out.println("����Զ���");
	}
}
