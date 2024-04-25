package com.sahoo.java8;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTop3OccurChars {

	public static void main(String[] args) {
		
		 String str = "applebananamangopineapple";
	     Map<Character, Long> map = str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); 
	     System.out.println(map);
	     
	     List<Long> sortedValues =  map.entrySet().stream().map(e->e.getValue()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
	     Map<Character,Long> top3CharOccur = new LinkedHashMap<Character, Long>();
	     int top=3;
	     for(Map.Entry entry : map.entrySet())
	     {
	    	 for(int i = 0; i<top; i++)
	    	 {
	    		 if(entry.getValue() == sortedValues.get(i))
	    		 {
	    			 top3CharOccur.put((Character)entry.getKey(), (Long)entry.getValue());
	    		 }
	    	 }
	     }
	     System.out.println(top3CharOccur);
	    	 
	}

}
