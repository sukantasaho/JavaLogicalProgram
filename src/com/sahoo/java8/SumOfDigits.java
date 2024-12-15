package com.sahoo.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfDigits {

	public static void main(String[] args) {
		int i = 77484;
	    int sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer :: parseInt));
        System.out.println(sum);
        int i1 = IntStream.range(1, 10).sum();
        System.out.println(i1);
        
	}

}
