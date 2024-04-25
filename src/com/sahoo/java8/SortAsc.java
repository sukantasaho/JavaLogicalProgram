package com.sahoo.java8;

import java.util.Collections;
import java.util.List;

public class SortAsc {

	public static void main(String[] args) {
		 List<Integer> list = List.of(101,23,455,667,88,99,32);
		 list.stream().sorted().forEach(System.out::println);
		 System.out.println("***************************************");
		 List<String> strs = List.of("apple","orane","banana","papaya","jackfruit");
		 strs.stream().sorted().forEach(System.out::println);
	}

}
