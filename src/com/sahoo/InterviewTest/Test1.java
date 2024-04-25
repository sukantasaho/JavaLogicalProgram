package com.sahoo.InterviewTest;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		 
		   String str = "Java concept of the day";
	       Map<Character, Long> charFrequncy = str.chars().mapToObj(ch->(char)ch).filter(c->c!=' ').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	       System.out.println(charFrequncy);
		 
	}
}
