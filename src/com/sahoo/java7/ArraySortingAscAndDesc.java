package com.sahoo.java7;

import java.util.Arrays;

public class ArraySortingAscAndDesc {

	public static void main(String[] args) {
		
		//sorting array asc order
		 int[] arr1 = {12,45,2,56,74,21,34,27,10}; 
		 for(int i = 0; i<arr1.length; i++)
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
		 }
		 System.out.println(Arrays.toString(arr1));
		 
		//sorting array desc order
		 int[] arr2 = {12,45,2,56,74,21,34,27,10}; 
		 for(int i = 0; i<arr2.length; i++)
		 {
			 for(int j = 0; j<arr2.length; j++)
			 {
				 if(i!=j && arr2[i]>arr2[j])
				 {
					 int temp = arr2[i];
					 arr2[i] = arr2[j];
					 arr2[j] = temp;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(arr2));

	}

}
