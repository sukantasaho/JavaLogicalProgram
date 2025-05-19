package com.record.java7;

public class ReverseStringUsingRecurrsion 
{

	public static void main(String[] args)
	{
		 String name = "Temple";
		 //String s1 = name.substring(1);
		 //System.out.println(s1);
		 System.out.println(recursiveString(name));
	}
	public static String recursiveString(String s)
	{
		
		if(s==null || s.length()<=1)
		{
			return s;
		}
		return recursiveString(s.substring(1))+s.charAt(0);
	}

}
