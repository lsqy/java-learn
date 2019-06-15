package com.lsqy;

import java.util.Scanner;

public class InterfaceTest {

	public static void main(String[] args) {
		CBCATM atm = new CBCATM();
		Card card = new Card("CBC", "123456", 5000);
		atm.setCard(card);
		System.out.println("请输入密码：");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (atm.checkPwd(input) ) {
			System.out.println("请输入金额：");
			double money = sc.nextDouble();
			if (atm.drawMoney(money)) {
				card.setBal(card.getBal() - money);
				System.out.println("取款成功，卡内余额：" + card.getBal());
			} else {
				System.out.println("余额不足，退出");
			}
		} else {
			System.out.println("密码错误，退出");
		}
	}
}
