package com.sahoo.java8;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		 List<String> list = List.of("php","java","python","java","dotNet","php","java","Groovy"); 
		 List<String> uniqueStrings = list.stream().distinct().collect(Collectors.toList());
		 System.out.println(uniqueStrings);
	}

}
