package com.sks;

public class TestCalc {
	
 static Calculator calculator;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator = new Calculator();
      System.out.println(calculator.add(200, 400));
      System.out.println(calculator.sub(300, 100));
	}

}
