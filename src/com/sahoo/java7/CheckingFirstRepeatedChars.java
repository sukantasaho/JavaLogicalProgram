package com.sahoo.java7;

import java.util.LinkedHashSet;
import java.util.Set;

public class CheckingFirstRepeatedChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str = "manFemale";
		Character firstRepeated = null;
		Set<Character> repeatedChars = new LinkedHashSet();
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
			if(!unique)
			{
			    //firstRepeated = str.charAt(i);
			   //repeatedChars.add(str.charAt(i));
			   System.out.println(str.charAt(i));
			   break;
			}
		}
		//System.out.println(firstRepeated);
		/*for(Character ch : repeatedChars)
		{
		 System.out.println(ch);
		}*/
	}

}
