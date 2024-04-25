package com.sahoo.java7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLargestOccurences {

	public static void main(String[] args) {
		//
		Map<String, Integer> map = Map.of("sukanta",12,"manoj",20,"mukti",50,"gaurav",100);
		 Map<String, Integer> mostFrequence = new HashMap<String, Integer>();
		 int mostFrequnceString = 0;
		 String str = null;
		 for(Map.Entry entry : map.entrySet())
		 {
			int value = (int) entry.getValue();
			if(mostFrequnceString<value)
			{
				mostFrequnceString = value;
				str = (String) entry.getKey();
			}
		 }
		 mostFrequence.put(str, mostFrequnceString);
		 
		System.out.println(mostFrequence);
	}

}
