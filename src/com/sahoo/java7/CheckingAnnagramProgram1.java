package com.sahoo.java7;

import java.util.Arrays;

public class CheckingAnnagramProgram1 
{
     
	public static void main(String[] args) 
	{
		 
         //what is annagram
		//Annagram is two String words which is having same length and same characters and does not matter order of placing 
	    String str1 = "LISTEN";
	    String str2 = "SILENT";
	    String msg = null;
	    if(str1.length()!= str2.length())
	    {
	        msg = "This is not a annagram";
	    }
	    else
	    {
	    	char[] arr1 = str1.toLowerCase().toCharArray();
	    	char[] arr2 = str2.toLowerCase().toCharArray();
	    	Arrays.sort(arr1);Arrays.sort(arr2);
	        boolean status = Arrays.equals(arr1, arr2);
	        if(status)
	        	msg = "This is a annagram";
	    }
	    System.out.println(msg);
	}
}
