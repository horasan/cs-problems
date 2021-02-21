package com.horasan.cs_dojo.arrays;

public class ArrayOperationsApi {

	// O(n+m)
	public static String reverseTheString(String str1) {
		// TODO: Validations.
		int length = str1.length();
		char[] strChars = str1.toCharArray();
		char[] reversed = new char[length];
		
		// O(n)
		for(int i = 0; i < length; i++) {
			reversed[i] = strChars[length - 1 - i];
		}
		
		// O(m)
		return new String(reversed);
	}
	
	public static String reverseTheStringUsingStack(String str1) {
		
		return "";
	}
	
	public static int[] mergeSort(int[] arr1, int[] arr2) {
		return null;
	}
	
}
