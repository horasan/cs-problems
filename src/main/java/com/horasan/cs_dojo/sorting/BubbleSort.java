package com.horasan.cs_dojo.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	/*
		BubbleSort bs = new BubbleSort();
		int[] array = new int[] {3, 5, 2, 1, 8, 6, 9};
		int[] sortedArray = bs.sort(array);
		Arrays.stream(sortedArray).forEach(System.out::println);
	*/
	
	public int[] sort(int[] array) {
		// new array is not created.
		
		int length = array.length;
		int left = -1;
		int right = -1;
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length - 1; j++) {
				left = array[j];
				right = array[j+1];
				if(left > right) {
					// swap the items
					int oldLeft = array[j];
					array[j] = array[j+1];
					array[j+1] = oldLeft;
				}
			}
		}
		
		return array;
	}
}
