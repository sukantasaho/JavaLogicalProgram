package com.sahoo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatatedElementInArray 
{
      public static void main(String[] args) {
    	  List<String> listOfStrings = Arrays.asList("Pen", "Pen","Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
          Map<String, Long> elementCountMap = listOfStrings.stream()
                                                           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
          
			/* 
			 Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
			 System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());
			 System.out.println("Count : "+mostFrequentElement.getValue());*/
          
			 long max = 0;
			  String elementName = null;
			  for(Map.Entry entry : elementCountMap.entrySet())
			  {
			  long count =   (long) entry.getValue();
			    if(max<count)
			    {
			    	max = count;
			    	elementName = (String)entry.getKey();
			    }
			  }
			  System.out.println("Most Frequent Element Name : "+elementName);
			  System.out.println("Count : "+max);
	}
}
