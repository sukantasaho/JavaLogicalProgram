package com.sahoo.java7;

import java.util.Arrays;

public class MergeTwoArraysIntoSingleArray {

	public static void main(String[] args) {
		 
		int[] firstArray = {10,20,30,40,50};
		int[] secondArray = {60,70,80,90,100,110,120,130};
		
		int fal = firstArray.length;
		int sal = secondArray.length;
		int[] resultArray = new int[fal+sal];
		System.arraycopy(firstArray, 0, resultArray, 0, fal);
		System.arraycopy(secondArray, 0, resultArray, fal, sal);
		System.out.println(Arrays.toString(resultArray));
		
		//merging two string array into single array
		/*String[] str1Array = {"Apple","Mango"};
		String[] str2Array = {"Grapes","Banana","Orange"};
		int length1 = str1Array.length;
		int length2 = str2Array.length;
		String[] resArray = new String[length1+length2];
		System.arraycopy(str1Array, 0, resArray, 0, length1);
		System.arraycopy(str2Array, 0, resArray, length1, length2);
		System.out.println(Arrays.toString(resArray));*/

	}

}
