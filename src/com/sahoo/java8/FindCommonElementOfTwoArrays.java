package com.sahoo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementOfTwoArrays {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(12,34,45,67,56);
		List<Integer> list2 = Arrays.asList(12,34,45,89,102,345);
		List<Integer> list = list1.stream().filter(list2 :: contains).collect(Collectors.toList());
        System.out.println(list);
	}

}
