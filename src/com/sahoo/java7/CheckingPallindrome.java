package com.sahoo.java7;

public class CheckingPallindrome
{

	public static void main(String[] args) 
	{
		 
            String str = "sks";
            String str1 = "";
            for(int i = str.length()-1; i>=0; i--)
            {
            	str1 = str1+str.charAt(i);
            }
            if(str.equals(str1))
            	
            	System.out.println("This is a pallindrome");
            else
            	System.out.println("This is not a pallindrome");
             
            
	}

}
