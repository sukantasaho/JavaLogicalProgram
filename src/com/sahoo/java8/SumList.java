package com.sahoo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumList {

	public static void main(String[] args) {
		//using java 8 mapToInt and sum method
		List<Integer> numbers = List.of(123,456);
        int res = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(res);
        
        //using reduce method
        int n = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(n);
        
        int n1 = numbers.stream().reduce(0,Integer::sum);
        System.out.println(n1);
        
        int n2 = numbers.stream().collect(Collectors.summingInt(Integer :: intValue));
        System.out.println(n2);
        
	}

}
