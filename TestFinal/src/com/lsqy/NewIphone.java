package com.lsqy;

public class NewIphone extends Iphone {
	
	public NewIphone(String type) {
		super(type);
	}
	// 因为父类Iphone的sendMsg使用了final进行修饰，所以在这里不可以再被重写了
//	public void sendMsg(String number, String msg) {
//		super.sendMsg(number, msg);
//		super.sendMsg("病毒", msg);
//	}
}
