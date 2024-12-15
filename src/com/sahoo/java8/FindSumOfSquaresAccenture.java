package com.sahoo.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindSumOfSquaresAccenture {

	public static void main(String[] args) {
		String[] numbers = {"2","5","4","6"};//4+16+36=56
		Integer sumOfSquares = Arrays.asList(numbers).stream().map(Integer :: parseInt).filter(e->e%2==0).map(e->e*e).collect(Collectors.summingInt(Integer :: intValue));
        System.out.println(sumOfSquares);
	}

}
