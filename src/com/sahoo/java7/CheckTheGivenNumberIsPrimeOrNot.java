package com.sahoo.java7;

import java.util.Scanner;

public class CheckTheGivenNumberIsPrimeOrNot 
{
    public static boolean isPrimeOrNot(int number)
    {
    	boolean isPrimeOrNot = false;
    	int countDiv = 0;
    	for(int i = 1; i<=number; i++)
    	{
    		if(number%i==0)
    			countDiv++;
    	}
    	if(countDiv == 2)
    		isPrimeOrNot = true;
    	
    	return isPrimeOrNot;
    	
    }
	public static void main(String[] args) 
	{
		 Scanner scn = new Scanner(System.in);
		 System.out.print("Enter Your Number:");
		 int num = scn.nextInt();
		 boolean status = isPrimeOrNot(num);
           if(status)
        	   System.out.println("This is a Prime Number");
           else
        	   System.out.println("This is not a Prime Number"); 
	}

}
