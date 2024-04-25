package com.sahoo.java8;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class FindLargestAndLowestOccurence {

	public static void main(String[] args) {
		//largest occurence
		Map<String, Integer> map = Map.of("key1", 100, "key2", 200, "key3", 300);
		 
		Optional<Entry<String, Integer>> maxEntry = map.entrySet().stream().max(Map.Entry.comparingByValue());
		Integer maxValue = maxEntry.get().getValue();  
		String key = maxEntry.get().getKey();
		Map<String, Integer> largestOcc = Map.of(key,maxValue);
        System.out.println(largestOcc);
        
        
        //lowest occurence
        Map<String, Integer> map1 = Map.of("key1", 100, "key2", 200, "key3", 300);
		 
		Optional<Entry<String, Integer>> minEntry = map.entrySet().stream().min(Map.Entry.comparingByValue());
		Integer minValue = minEntry.get().getValue();  
		String key1 = minEntry.get().getKey();
		Map<String, Integer> lowesttOcc = Map.of(key,minValue);
        System.out.println(lowesttOcc);
        
        
        
	}

}
