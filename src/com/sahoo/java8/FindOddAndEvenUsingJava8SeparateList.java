package com.sahoo.java8;

import java.util.List;
import java.util.stream.Collectors;

public class FindOddAndEvenUsingJava8SeparateList 
{

	public static void main(String[] args) 
	{
		 List<Integer> numList = List.of(12,23,4,5,67,78,85,14);
		 List<Integer> evenList = numList.stream().filter(e->e%2==0).collect(Collectors.toList());
		 System.out.println(evenList);
		 List<Integer> oddList = numList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		 System.out.println(oddList);

	}

}
