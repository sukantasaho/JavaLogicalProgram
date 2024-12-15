package com.sahoo.InterviewTest;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
 
		  String str = "hi hello hi hello welcome";
	      Map<String,Long> duplicateFrequncy = Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	      System.out.println(duplicateFrequncy);
	}
}

 
