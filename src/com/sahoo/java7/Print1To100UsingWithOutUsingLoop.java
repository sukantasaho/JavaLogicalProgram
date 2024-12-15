package com.sahoo.java7;

public class Print1To100UsingWithOutUsingLoop {

	public static void main(String[] args) {
        
		print(1);
	}
    public static int print(int num) {
    	if(num>0 && num<=100)
    	{
    	     System.out.println(num);
    	     return print(num+1);
    	}
    	return 0;
    			
    }
}
