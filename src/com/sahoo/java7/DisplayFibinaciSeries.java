package com.sahoo.java7;

public class DisplayFibinaciSeries {

	public static void main(String[] args) {
		 int n = 5;
		 int firstNum = 0;int secondNum = 1;int thirdNum = 0;
		 
		 for(int i = 0; i<=n; i++)
		 {
			 thirdNum = firstNum+secondNum;
			 firstNum = secondNum;
			 secondNum = thirdNum;
			System.out.println(firstNum);
		 }
		 

	}

}
