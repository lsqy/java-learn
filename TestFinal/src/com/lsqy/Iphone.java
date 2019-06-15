package com.lsqy;

public class Iphone {
	
	private final String type;
	
	public Iphone(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	/**
	 * 使用final进行修饰后，该方法就不会再被子类进行重写了
	 * @param number
	 * @param msg
	 */
	public final void sendMsg(final String number, final String msg) {
		System.out.println("使用"+this.type+"给"+number+"发"+msg);
	}
}
