package com.sahoo.java8;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToStringCommaSeparatedValue {

	public static void main(String[] args) {
		 List<String> str = List.of("hello", "Jit", "DON");
	        
	        String result = str.stream()
	                           .map(s -> "'" + s + "'")
	                           .collect(Collectors.joining(","));

	        System.out.println(result); // Output: 'hello','Jit','DON'

	}

}
