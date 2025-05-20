package com.sahoo.java7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMaximumNumberConsecutive1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 3;
        System.out.println("Max consecutive 1s (with at most "+k+" flips): "+ longestOnes(nums, k));
	}
    
	public static int longestOnes(int[] nums, int k) {
		int left=0, right = 0, zeros = 0, maxLen=0;
		while(right<nums.length) {
			//Expand the window
			if(nums[right]==0) {
				zeros++;
			}
			//Shrink window if too many zeros
			while(zeros>k) {
			    if(nums[left]==0) {
			    	zeros--;
			    }
			    left++;
			}
			//update max length of valid window
			maxLen = Math.max(maxLen, right-left+1);
			right++;
			
		}
		return maxLen;
	}
}
