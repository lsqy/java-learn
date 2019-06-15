package com.lsqy;

/**
 * 银行卡
 * @author liushaoqian
 *
 */
public class Card {
	
	private String bank; // 银行
	private String pwd; // 密码
	private double bal; // 余额
	
	public Card(String bank, String pwd, double bal) {
		super();
		this.bank = bank;
		this.pwd = pwd;
		this.bal = bal;
	}
	
	public String getBank() {
		return bank;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public double getBal() {
		return bal;
	}
	
	public void setBal(double bal) {
		this.bal = bal;
	}	
}
