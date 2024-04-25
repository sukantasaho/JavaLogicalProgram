package com.sahoo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetMax3AndMin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		 System.out.println("Minimum 3 Numbers :");
		 listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
		 System.out.println("*********************");
		 System.out.println("Maximum 3 Numbers : ");
		 listOfIntegers.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);;
	}

}
