package com.sahoo.java7;

import java.util.Arrays;
import java.util.List;

public class Get2ndHighestNumberWithOutUsingSortingAndStreamAPIMethods {

	public static void main(String[] args) {
     List<Integer> nums = List.of(23,2,13,45,65,67,567,321,345);
     Integer[] arr = nums.toArray(new Integer[0]);
     //System.out.println(Arrays.toString(arr));
     for(int i = 0; i<arr.length; i++)
     {
    	  for(int j = 0; j<arr.length; j++)
    	  {
    		  if(i!=j && arr[i]>arr[j])
    		  {
    			  int temp = arr[i];
    			  arr[i] = arr[j];
    			  arr[j] = temp;
    		  }
    	  }
     }
     System.out.println(Arrays.toString(arr));
     System.out.println("Second Highest Number Is : "+arr[1]);
     
	}
}
