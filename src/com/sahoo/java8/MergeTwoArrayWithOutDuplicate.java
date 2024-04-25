package com.sahoo.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoArrayWithOutDuplicate {

	public static void main(String[] args) {
		 
		int[] arr1 = {12,34,56,67,87,12};
		int[] arr2 = {12,67,90,123,45,89};
		int[] arr = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
	    System.out.println(Arrays.toString(arr));
	}

}
