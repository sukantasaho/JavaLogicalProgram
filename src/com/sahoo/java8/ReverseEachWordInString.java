package com.sahoo.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		 String str = "Java Concept Of The Day";
		 String reverseStr = Arrays.stream(str.split(" ")).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
         System.out.println(reverseStr);
	}

}
