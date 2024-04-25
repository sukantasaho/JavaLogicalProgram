package com.sahoo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergeTwoArrayIntoSingleArray {

	public static void main(String[] args) {
		System.out.println("Merge two array with out sorting");
		 int[] arr1 = new int[] {2,5,7,8};
		 int[] arr2 = new int[] {10,20,45,67};
		 int[] arr = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
		System.out.println(Arrays.toString(arr));
	
		System.out.println("*****************************************");
		System.out.println("Merge two array with sorting");
		//merge two array with sorting
		int[] arr3 = new int[] {89,100,400,340};
		int[] arr4 = new int[] {23,45,12,26,48};
		int[] mergeArray = IntStream.concat(Arrays.stream(arr3), Arrays.stream(arr4)).sorted().toArray();
		System.out.println(Arrays.toString(mergeArray));
	}

}
