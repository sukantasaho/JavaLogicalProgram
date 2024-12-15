package com.sahoo.java7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckPallindromeUsingStreamAndCorejava {

	public static void main(String[] args) {
		 String str1 = "madam".toLowerCase();
		 System.out.println(checkingPallindrome(str1));
		 System.out.println(checkPallindromeByStreamAPI(str1));

	}
	public  static boolean checkingPallindrome(String str)
	{
		 
		 
		String pallindrome = "";
		 for(int i = str.length()-1; i>=0; i--)
		 {
			 pallindrome = pallindrome+str.charAt(i);
		 }
		  
		 if(pallindrome.equalsIgnoreCase(str))
		 {
			 return true;
		 }
		 return false;
		  
	}
	public static boolean checkPallindromeByStreamAPI(String str)
	{
		String str1 =  Stream.of(str).map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(""));
		//System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str.hashCode());
		
		return  str1.equals(str);
	}

}
