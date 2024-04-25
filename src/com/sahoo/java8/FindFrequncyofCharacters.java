package com.sahoo.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequncyofCharacters {

	public static void main(String[] args) {
		 String str = "Welcome to india i am from landon";
		 Map<Character, Long> countChars = str.chars().filter(e->e!=' ').mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         System.out.println(countChars);
	}

}
