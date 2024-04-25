package com.sahoo.java7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortAscArrayAndReverseFindFirstRepeatedNum2 {

	public static void main(String[] args) {
		
       int[] arr1 = {2,4,7,8,10,2,4,7,9};
		/*for(int i = 0; i<arr1.length; i++)
		{
			for(int j = 0; j<arr1.length; j++)
			{
				if(i!=j && arr1[i]<arr1[j])
				{
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}*/
       //array is sorted in asc order
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//reversed array
		reverseArray(arr1);
		System.out.println(Arrays.toString(arr1));
       //finding first repeated number
		System.out.println(findFirstRepeated(arr1));
	}
	public static void reverseArray(int[] arr1)
	{
		int start = 0;
		int end = arr1.length-1;
		while(start<end)
		{
			 int temp = arr1[start];
			 arr1[start] = arr1[end];
			 arr1[end] = temp;
			 
			 start++;
			 end--;
		}
		 
	}
   public static int findFirstRepeated(int[] arr1)
   {
	   Set<Integer> set = new HashSet();
		 for(int num : arr1)
		 {
			 if(set.contains(num))
			 {
				 return num;
				 
			 }
			 set.add(num);
		 }
		 return -1;
   }
}
