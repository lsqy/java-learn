package com.lsqy;

public class Animal {

	private int weight;
	
	public void setWeight(int w) {
		weight = w;
		System.out.println("动物体重设置为" + w);
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void eat() {
		System.out.println("动物吃东西");
	}
}
