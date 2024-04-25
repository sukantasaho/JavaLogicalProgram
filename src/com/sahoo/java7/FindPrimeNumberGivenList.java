package com.sahoo.java7;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumberGivenList 
{
	
     public static List<Integer> findPrimeNumberList(List<Integer> numList)
     {
    	 List<Integer> primeNumList = new ArrayList<Integer>();
    	 
    	 if(!numList.isEmpty())
    	 {
    		 for(int i = 0; i<numList.size(); i++)
    		 {
    			 
    			 int countDiv = 0;
    			 for(int j = 1; j<=numList.get(i); j++)
    			 {
    				 if(numList.get(i)%j==0)
    				 countDiv++;
    				 
    			 }
    			 if(countDiv == 2)
    				primeNumList.add(numList.get(i)); 
    		 }
    	 }
    	 return primeNumList;
     }
	public static void main(String[] args) 
	{
		//requirement find primenumbers of given list of numbers
		 List<Integer> numList = List.of(12,23,45,6,7,88,1,5,16,48,96,31,325,78);
		 findPrimeNumberList(numList).forEach(System.out::println);
		 
	}

}
