package com.sahoo.java8;

import java.util.stream.IntStream;

public class FindSumOf10NaturalNum {

	public static void main(String[] args) {
		int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);
         
	}

}
