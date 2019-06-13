package com.test;

/**
 * javadoc≤‚ ‘
 * @author liushaoqian
 *
 */
public class NestFor {
	// 1 2 3 4
	// 2 2 3 4
	// 3 2 3 4
	// 4 2 3 4
	/**
	 * œ‘ æjavadoc
	 * @param args
	 * @return Œﬁ
	 */
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			System.out.print(i+" ");
			for(int j = 2; j <= 4; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
