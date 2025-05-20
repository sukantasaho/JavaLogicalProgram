package com.sahoo.java7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOutSumOfPair {

	public static void main(String[] args) {

		int[] arr = {1,23,22,2,20,4,34,12,12,12,14,12,14,36,14,10};
		int target = 24;
		
		List<String> pairList = new ArrayList<>();
		//if you want to store array of array use List<Integer,Integer> in side List
		//approach-1 not recomondded becoz multiple times of paired of sum two numbers
		/*for(int i=0; i<arr.length; i++) {
			 
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					pairList.add(List.of(arr[i],arr[j]));
				}
			}
		}
		System.out.println("Pairs with sum "+target+": "+pairList);*/
		
		 Map<Integer, Boolean> map = new HashMap<>();
		for(int num : arr) {
			int complement = target-num;
			if(map.getOrDefault(complement, false)==false && map.containsKey(complement)) {
				pairList.add("["+complement+","+num+"]");
				map.put(complement, true);
				map.put(num, true);
			}else {
				map.putIfAbsent(num, false);
			}
		}
		
		System.out.println("Pairs with sum Using Enhanced Code Using Map "+target+": "+pairList);
		 
		
	}
	
	 

}
