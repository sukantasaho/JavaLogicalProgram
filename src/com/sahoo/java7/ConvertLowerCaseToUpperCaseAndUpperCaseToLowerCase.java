package com.sahoo.java7;

import java.util.stream.IntStream;

public class ConvertLowerCaseToUpperCaseAndUpperCaseToLowerCase {

	public static void main(String[] args) {
		 String input = "Sahoo";
		 String output = "";//sAHOO
		 
		 char[] c = input.toCharArray();
		 for(int x = 0; x<c.length; x++) {
			 if (c[x] >= 'A' && c[x] <= 'Z' )
				 output = output.concat(String.valueOf(c[x]).toLowerCase());
			 else if(c[x]>='a' && c[x]<='z')
				output = output.concat(String.valueOf(c[x]).toUpperCase());
		 }
		 System.out.println(output);
	
	}

}
