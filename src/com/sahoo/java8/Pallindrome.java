package com.sahoo.java8;

import java.util.stream.IntStream;

public class Pallindrome {

	public static void main(String[] args) {
		 
		String str = "ROTATOR";
   
        boolean isItPalindrome = IntStream.range(0, str.length()/2).
                noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));
          
        if (isItPalindrome)
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
	}

}
