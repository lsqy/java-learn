package com.lsqy;

/**
 * √∞≈›≈≈–Ú µœ÷
 * @author liushaoqian
 *
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {12, 3, 1, 17, 52, 93, 11, 9};
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
