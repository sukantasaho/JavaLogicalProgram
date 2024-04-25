package com.sahoo.java7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPrimeNuberGivenArrayAndReturnArray {

	public static List<Integer> findPrimeArray(int[] arr)
	{
		 
		List<Integer> primeArray = new ArrayList<>();
		for(int i = 0; i<arr.length; i++)
		{
			int countDiv = 0;
			for(int j = 1; j<=arr[i]; j++)
			{
				if(arr[i]%j==0)
				{
					countDiv++;
				}
			}
			if(countDiv==2)
			{
			    primeArray.add(arr[i]);
			}
		}
		return primeArray;
	}
	public static void main(String[] args) {
		 
   findPrimeArray(new int[] {12,2,34,5,29,23,25,67,87,31}).forEach(e->System.out.println(e));
	}

}
