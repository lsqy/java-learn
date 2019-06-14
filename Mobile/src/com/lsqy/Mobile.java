package com.lsqy;

public class Mobile {

	private int weight = 0;
	private String brand = "Apple";
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setBrand(String b) {
		brand = b;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setBrand("huawei");
		m.setWeight(2000);
		System.out.println(m.getBrand() + "--" + m.getWeight());
	}
}
