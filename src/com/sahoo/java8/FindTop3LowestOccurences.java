package com.sahoo.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTop3LowestOccurences {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("sukanta",23,"raja",45,"gaurav",67,"manoj",56,"amit",123,"anita",78,"saroj",232);
        List<Integer> sortedValues = map.entrySet().stream().map(e->e.getValue()).sorted().collect(Collectors.toList());
	    Map<String, Integer> lowestOccurence = new HashMap<String, Integer>();
	    int top = 3;
	    for(Map.Entry entry : map.entrySet())
	    {
	    	for(int i = 0; i<top; i++)
	    	{
	    		if((Integer)entry.getValue() == sortedValues.get(i))
	    		{
	    			lowestOccurence.put((String)entry.getKey(), (Integer)entry.getValue());
	    		}
	    	}
	    }
	    System.out.println(lowestOccurence);
	}

}
