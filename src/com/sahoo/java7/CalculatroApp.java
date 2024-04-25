package com.sahoo.java7;

public class CalculatroApp {

	public static void main(String[] args) {
		 
           System.out.println(calculator(100,200, '-'));
	}
    public static double calculator(double firstNum, double secondNum, char operator)
    {
    	switch(operator)
    	{
    	    case '+':
    	    {
    	    	return add(firstNum, secondNum);
    	    }
    	    case '-':
    	    {
    	    	return sub(firstNum, secondNum);
    	    }
    	    case '*':
    	    {
    	    	return mul(firstNum, secondNum);
    	    }
    	    case '/':
    	    {
    	    	return div(firstNum, secondNum);
    	    }
    	    default:
    	    	throw new IllegalArgumentException("Unsupported Exception : "+operator);
    	}
    	
    }
    private static double add(double firstNum, double secondNum)
    {
    	return (firstNum+secondNum);
    }
    private static double sub(double firstNum, double secondNum)
    {
    	return (firstNum-secondNum);
    }
    private static double mul(double firstNum, double secondNum)
    {
    	return (firstNum*secondNum);
    }
    private static double div(double firstNum, double secondNum)
    {
    	return (firstNum/secondNum);
    }
}
