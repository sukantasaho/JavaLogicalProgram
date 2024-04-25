package com.sahoo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDivisibleBy5 {

	public static void main(String[] args) {
		 
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> list = listOfIntegers.stream().filter(e->e%5==0).collect(Collectors.toList());
        System.out.println(list);
	}
}
