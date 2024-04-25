package com.sahoo.java7;

public class ReverseString {

	public static void main(String[] args) {
       String s = "this is a simple program";
	   String revString = "";

		  for (int i = s.length() - 1; i >= 0; i--) {
		        revString += s.charAt(i);
		  }

		  System.out.println(revString);

	}

}
