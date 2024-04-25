package com.sahoo.java7;

import java.util.LinkedHashSet;
import java.util.Set;

public class CheckingFirstNonRepeatedChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str = "manFemale";
		for(int i = 0; i<str.length(); i++)
		{
			boolean unique = true;
			for(int j = 0; j<str.length(); j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					 unique = false;  
				}
			}
			if(unique)
			{
			   System.out.println(str.charAt(i));
			   break;
			}
		}
		 
	}

}
