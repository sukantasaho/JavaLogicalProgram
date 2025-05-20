package com.sahoo.java7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindConsonantsInString {

	public static void main(String[] args) {
         
		String str = "manoj sahoo manoj sahooooohhhhhmmm";
		 Set<Character> consList = new HashSet<>();
		//outout-mnjsh
	     for(int i = 0; i<str.length(); i++) {
	    	 char ch = str.charAt(i);
	    	 if(ch!=' ' && !findConsonant(ch)) {
	    		 consList.add(str.charAt(i));
	    	 }
	     }
	     System.out.println(consList);
		
	}
     
	public static boolean findConsonant(char ch) {//m
		 
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' & ch!=' ') {
			return true;
		}
		else {
			return false;
		}
	}
}
