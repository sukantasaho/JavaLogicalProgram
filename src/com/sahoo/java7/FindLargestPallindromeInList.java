package com.sahoo.java7;

import java.util.List;

public class FindLargestPallindromeInList {

	public static void main(String[] args) {
		List<String> stringList = List.of("level", "noon", "radar", "java", "madam", "racecar");

        String longestPalindrome = findLongestPalindrome(stringList);

        System.out.println("Longest Palindrome: " + longestPalindrome);

	}
	 public static String findLongestPalindrome(List<String> stringList) {
	        String longestPalindrome = "";

	        for (String str : stringList) {
	            if (isPalindrome(str) && str.length() > longestPalindrome.length()) {
	                longestPalindrome = str;
	            }
	        }

	        return longestPalindrome;
	    }

	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }
}
