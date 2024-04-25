package com.sahoo.java7;

public class LargestPallindrome {

	public static void main(String[] args) {
		String input = "abacdefedcba";
        String largestPalindrome = findLargestPalindrome(input);
        System.out.println("Largest palindrome: " + largestPalindrome);

	}
	public static String findLargestPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String largestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() > largestPalindrome.length()) {
                    largestPalindrome = substring;
                }
            }
        }
        return largestPalindrome;
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
