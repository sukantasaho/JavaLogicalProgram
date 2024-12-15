package com.sahoo.java7;

import java.util.List;

public class ComparingTwoListIfSameReturnTrueOrFalse {

	public static void main(String[] args) {
		List<Integer> l1 =  List.of(1,2,3,4,5,6);
		List<Integer> l2 =  List.of(1,2,3,4,5,6);
		List<Integer> l3 = List.of(1,2,3,4);
		boolean isEqual = compareLists(l1, l2);
		System.out.println(isEqual);
		isEqual = compareLists(l1, l3);
		System.out.println(isEqual);
		 

	}
	public static boolean compareLists(List<Integer> list1, List<Integer> list2) {
		// Check if both lists are null or reference the same object
		if(list1 == list2) {
			return true;
		}
		// Check if either list is null or their sizes are different
        if (list1 == null || list2 == null || list1.size() != list2.size()) {
            return false;
        }
        // Compare elements of both lists using Stream API
        return list1.stream()
                .allMatch(element -> list2.contains(element));
	}
}
