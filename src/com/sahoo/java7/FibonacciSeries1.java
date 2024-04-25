package com.sahoo.java7;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		 //10=>0,1,2,4,5,6,7,8,9,10=53
		int n = 10;
		int firstNum = 0; int secondNum = 1; int thirdNum = 0;
		for(int i = 0; i<=n; i++)
		{
			thirdNum = firstNum+secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
			System.out.print(firstNum+" ");
		}
      
	}

}
