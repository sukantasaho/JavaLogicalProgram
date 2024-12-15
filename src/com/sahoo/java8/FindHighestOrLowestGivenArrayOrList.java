package com.sahoo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindHighestOrLowestGivenArrayOrList 
{

	public static void main(String[] args) 
	{
		 List<Integer> list = List.of(23,12,34,56,78,234,67,99,87,432,123);
		 List<Integer> s = list.stream().sorted((num1,num2)->(int)(num2-num1)).limit(1).toList();
	     System.out.println(s);
	     
	     HashSet<Integer> hs = new HashSet<>();
	     hs.add(100);
	     hs.add(526);
	     hs.add(784);
	     hs.add(16);
	     System.out.println(hs);
	     LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	     lhs.add(100);
	     lhs.add(526);
	     lhs.add(784);
	     lhs.add(16);
	     System.out.println(lhs);
	     
	      
	     
	}

}
