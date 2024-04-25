package com.sahoo.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOddAndEvenInSingleLineUsingJava8 
{

	public static void main(String[] args)
	{
		 List<Integer> numList = List.of(1,4,5,6,7,8,9,12,23,45,65,5,80);
		 Map<Boolean, List<Integer>> map = numList.stream().collect(Collectors.partitioningBy(e->e%2==0));
		 System.out.println(map);
		  
		 }
	}

