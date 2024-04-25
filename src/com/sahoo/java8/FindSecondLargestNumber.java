package com.sahoo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,45,67,89,58,78);
        Integer secondLargestNum = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargestNum);
	}

}
