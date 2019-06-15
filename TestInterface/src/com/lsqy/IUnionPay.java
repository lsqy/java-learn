package com.lsqy;

/**
 * 银联统一支付接口
 * @author liushaoqian
 *
 */
public interface IUnionPay {
	
	/**
	 * 验证密码的方法
	 * @param input 用户输入的密码
	 * @return 是否验证成功
	 */
	boolean checkPwd(String input);
	
	/**
	 * 取钱的方法
	 * @param money 输入的金额
	 * @return 是否取钱成功
	 */
	boolean drawMoney(double money);
	
	/**
	 * 查询余额的方法
	 * @return 返回余额
	 */
	double getBalance();
}
