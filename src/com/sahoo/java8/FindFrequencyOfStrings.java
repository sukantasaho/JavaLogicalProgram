package com.sahoo.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfStrings {

	public static void main(String[] args) {
		 String words = "welcome to world and welcome to java programming";
		 String arr[] = words.split(" ");
	  	 Map<String, Long> countFrequency = Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	  	 System.out.println(countFrequency);

	}

}
