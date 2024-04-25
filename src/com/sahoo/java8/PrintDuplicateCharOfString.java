package com.sahoo.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintDuplicateCharOfString {

	public static void main(String[] args) {
		 
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		Set<String> uniqueChars = new HashSet();
		Set<String> duplicateChars = Stream.of(inputString.split("")).filter(ch->!uniqueChars.add(ch)).collect(Collectors.toSet());
	    System.out.println(duplicateChars);
	}

}
