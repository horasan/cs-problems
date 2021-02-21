package com.horasan.cs_dojo.sorting;

import java.util.Arrays;

public class InsertionSort {

	/*
		InsertionSort bs = new InsertionSort();
		int[] array = new int[] {3, 5, 2, 1, 8, 6, 9};
		int[] sortedArray = bs.sort(array);
		Arrays.stream(sortedArray).forEach(System.out::println);
	*/
	public int[] sort(int[] array) {
		
		int length = array.length; 
		int currentValue = -1;
		int currentIndex = -1;
		for (int i = 0; i < length; i++) {
			currentValue = array[i];
			currentIndex = i;
			for(int j = i; j >= 0; j--) {
				if (currentValue < array[j]) {
					// swap them
					int temp = array[j];
					array[j] = array[currentIndex];
					array[currentIndex] = temp;
					currentIndex = j;
				}
			}
		}
		return array;
	}
	
}
