package com.horasan.cs_dojo.sorting;

import java.util.Arrays;

public class SelectionSort {

	/*
	 	SelectionSort bs = new SelectionSort();
		int[] array = new int[] {3, 5, 2, 1, 8, 6, 9};
		int[] sortedArray = bs.sort(array);
		Arrays.stream(sortedArray).forEach(System.out::println);
	 */
	public int[] sort(int[] array) {
		
		int length = array.length;
		
		int minValue = -1;
		int minValueIndex = -1;
		for(int i = 0; i < length; i++) {
			minValue = array[i];
			minValueIndex = i;
			for(int j = i+1; j < length; j++) {
				if(minValue > array[j]) {
					// swap items
					minValue = array[j];
					minValueIndex = j;
				}
			}
			// swap i and minValueIndex
			int temp = array[i];
			array[i] = minValue;
			array[minValueIndex] = temp;
		}
		
		
		return array;
	}
}
