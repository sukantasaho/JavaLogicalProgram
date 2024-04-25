package com.sahoo.java8;

import java.util.List;
import java.util.stream.Collectors;

public class FindNumberListWhichIsStartsWithOne {

	public static void main(String[] args) {
		 
		List<Integer> numList = List.of(12,32,34,56,15,18,10,37,50,45);
		//filtering whose number starts with 1 and converting to number type
		List<Integer> list = numList.stream().map(e->e+"")
		.filter(e->e.startsWith("1")).map(n->Integer.parseInt(n)).collect(Collectors.toList());
		System.out.println(list);
		
		//result displaying string
		        numList.stream().map(e->e+"")
				.filter(e->e.startsWith("3")).forEach(System.out::println);
		        
		      // display who start with 1 and 3  
		        List<Integer> list1 = numList.stream().map(e->e+"")
		        		.filter(e->{
		        			return (e.startsWith("1") || e.startsWith("3"));
		        		}).map(n->Integer.parseInt(n)).collect(Collectors.toList());
		        		System.out.println(list);
		        		System.out.println(list1);

	}

}
