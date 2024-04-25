package com.sahoo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTopLargest3Occurences {

	public static void main(String[] args) {
		
		
		
		 
		  
		Map<String, Integer> map = Map.of("sukanta",23,"raja",45,"gaurav",67,"manoj",56,"amit",123,"anita",78,"saroj",232);
		  
         List<Integer> sortedValues = (List<Integer>) map.entrySet().stream().map(e-> e.getValue()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
	     System.out.println(sortedValues);
	 
	     Map<String, Integer> top3Occurences = new LinkedHashMap<String, Integer>();
	     int top=3;  
	    for(Map.Entry entry : map.entrySet())
	    {
	    	    
	    	     for(int i = 0; i<top; i++)
	    	     {
	    	    	 if((Integer)entry.getValue()==sortedValues.get(i))
				    		top3Occurences.put((String)entry.getKey(), (Integer)entry.getValue());
	    	     }  
	    }
	     System.out.println(top3Occurences);
	}

}
