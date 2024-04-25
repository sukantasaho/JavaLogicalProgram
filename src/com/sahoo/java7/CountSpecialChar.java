package com.sahoo.java7;

public class CountSpecialChar {

	public static void main(String[] args) {
		 String str = "suksah@gmail#";
		 int count = 0;
		 for(int i = 0; i<str.length(); i++)
		 {
			 if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && 
						!Character.isWhitespace(str.charAt(i)))
			 {
				 count++;
			 }
		 }
		 System.out.println("No Of Special Characters:"+count);

	}

}
