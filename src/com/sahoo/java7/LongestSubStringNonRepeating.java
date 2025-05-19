package com.sahoo.java7;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringNonRepeating {

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abcbbdeadb"));
		
	}
     
	public static int lengthOfLongestSubstring(String s) {
		int left = 0, right = 0, start=0, maxLen = 0;
		Set<Character> set = new HashSet<>();
		
		while(right< s.length()) {
			   if(!set.contains(s.charAt(right))) {
				   set.add(s.charAt(right));
				   maxLen = Math.max(maxLen, right-left+1);
				   start = left;
				   right++;
			   } else {
				   set.remove(s.charAt(left));
				   left++;
			   }
		}
		//if u want to see like eadb or else return maxLen
		 return s.substring(start, start + maxLen);
	}
}
