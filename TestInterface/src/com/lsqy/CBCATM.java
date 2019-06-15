package com.lsqy;

public class CBCATM implements IUnionPay {
	
	public Card card;
	public void setCard(Card card) {
		this.card = card;
	}
	
	@Override
	public boolean checkPwd(String input) {
		if (input.equals(card.getPwd())) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean drawMoney(double money) {
		if (money <= card.getBal()) {
			return true;
		}
		return false;
	}
	
	@Override
	public double getBalance() {
		return card.getBal();
	}
}
