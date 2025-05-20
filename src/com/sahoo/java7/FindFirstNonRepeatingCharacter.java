package com.sahoo.java7;

public class FindFirstNonRepeatingCharacter 
{

	public static void main(String[] args)
	{
		 String word = "JACKJAL";
		 
		 for(int i=0; i<word.length(); i++)
		 {
			 
			 boolean unique = true;
			 for(int j=0; j<word.length(); j++)
			 {
				  if(i!=j && word.charAt(i)==word.charAt(j))
				  {
					  unique = false;
				  }
			 }
				if(unique)
				{
					System.out.println(word.charAt(i));
					break;
				}
		 }

	}

}
