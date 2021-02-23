package com.horasan.cs_dojo.samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

public class EasySamples {

	
	
	/*
		int[] array = new int[] {2, 7, 11, 15};
		int target = 9;
		int[] result = twoSum(array, target);
	*/
	public static int[] twoSum(int[] array, int target) {
		HashMap<Integer, Integer> compMap = new HashMap<>();
		
		for(int i = 0; i < array.length; i++) {
			int comp = target - array[i];
			if(compMap.containsKey(comp)) {
				return new int[] {compMap.get(comp), i};
			}
			compMap.put(array[i], i);
		}
		
		return null;
	}
	
	
	/*
	 	Given a signed 32-bit integer x, return x with its digits reversed.
	 	If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
		Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
	 */
	
	public static int reverseInteger(int number) {

		long result = 0;

		while (number != 0) {

			result = result * 10 + number % 10;

			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
				return 0;
			}

			number = number / 10;
		}

		return (int) result;

	}

	/*
	 * Implement the myAtoi(string s) function, which converts a string to a 32-bit
	 * signed integer (similar to C/C++'s atoi function).
	 */
	public static int myAtoi(String s) {

		 if (s == null) {
				return 0;
			}
			
			s = s.trim();
			
			if (s.length() == 0) {
				return 0;
			}
			
			int len = s.length();
			
			int result = 0;
			
			
			char[] ss = s.toCharArray();
			
			
			int sign = +1;
			int i = 0;
			
			if (ss[0] == '-') {
				sign = -1;
				i = i + 1;
			}
			else if (ss[0] == '+') {
				sign = +1;
				i = i + 1;
			}
			
			for(; i < len; i++) {
				if (Character.isDigit(ss[i])) {
					
					if (sign == 1) {
						if (result > Integer.MAX_VALUE / 10) {
							return Integer.MAX_VALUE;
						}
						else if (result == Integer.MAX_VALUE / 10) {
							if ((i) != len) {
								if ((ss[i] - '0') > Integer.MAX_VALUE%10) {
									return Integer.MAX_VALUE;
								}
							}
						}	
					}
					else {
						
						if ((-1 * result) < (Integer.MIN_VALUE) / 10) {
							return Integer.MIN_VALUE;
						}
						else if ((-1 * result) == (Integer.MIN_VALUE) / 10) {
							if ((i ) != len) {
								if ((-1 * (ss[i] - '0')) < (Integer.MIN_VALUE)%10) {
									return Integer.MIN_VALUE;
								}
							}
						}
					}
					
					result = result * 10 + (ss[i] - '0');
				}
				else {
					return sign * result;
				}
				
			}	
			
			
			
			return sign * result;
	}

	/*
	Given an integer x, return true if x is palindrome integer.
	An integer is a palindrome when it reads the same backward as forward. 
	For example, 121 is palindrome while 123 is not.
		System.out.println(isPalindrome(-12821));
	*/
	public static boolean isPalindrome(int x) {
		
		List<Integer> numbers = new ArrayList<>();
		int number = x;
		int num = -1;
		int reversed = 0;
		while (number > 0) {
			num = number % 10;
			numbers.add(num);
			number = number / 10;
			reversed = reversed * 10 + num;
		}
		
		if (x == reversed) {
			return true;
		}
		else {
			return false;
		}
		
	
	}
	
	/*
		Write a function to find the longest common prefix string amongst an array of strings.
		If there is no common prefix, return an empty string "".
	
		Input: strs = ["flower","flow","flight"]
		Output: "fl"
	

		Input: strs = ["dog","racecar","car"]
		Output: ""
		Explanation: There is no common prefix among the input strings.
	*/
	
	public static String longestCommonPrefix(String[] strs) {

		if (strs == null) {
			return "";
		}
		if(strs.length == 1) {
			return strs[0]; 
		}
		
		int minLen = Integer.MAX_VALUE;

		int inputLen = strs.length;

		for (int i = 0; i < inputLen; i++) {
			minLen = Math.min(minLen, strs[i].length());
		}

		StringBuffer result = new StringBuffer("");
		String aa = "";
		boolean same = false;
		for (int i = 0; i < minLen; i++) {
			aa = "";
			same = false;
			for (int j = 0; j < inputLen; j++) {

				if (aa == "") {
					aa = String.valueOf(strs[j].charAt(i));
					same = false;
				} else {
					if (aa.equals(String.valueOf(strs[j].charAt(i)))) {

						same = true;
					} else {
						same = false;
						break;
					}
				}
			}

			if (same) {
				result.append(aa);
			} else {
				break;
			}

		}

		return result.toString();
	}
				
	
	public static void main(String[] args) {
		
		
		String [] bb = new String [] {"flower","flow","flight"};
		String aa = longestCommonPrefix(bb);
		
	}
	
}
