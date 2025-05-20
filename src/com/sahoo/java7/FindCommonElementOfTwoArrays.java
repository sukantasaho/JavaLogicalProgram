package com.sahoo.java7;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementOfTwoArrays 
{
    
     
     public static void main(String[] args)
     {
    	 int[] arr1 = {2,3,5,4,6,8,9};
         int[] arr2 = {4,5,6,8};
         
         Set<Integer> hs = new HashSet<>();
         for(int i = 0; i<arr1.length; i++)
         {
        	 
        	    for(int j = 0; j<arr2.length; j++)
        	    {
        	    	if(i!=j && arr1[i]==arr2[j])
        	    	{
        	    		hs.add(arr1[i]);
        	    	}
        	    }
         }
         System.out.println(hs);
	 }
    
}
