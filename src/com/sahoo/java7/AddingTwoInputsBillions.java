package com.sahoo.java7;

import java.math.BigInteger;

public class AddingTwoInputsBillions {

	public static void main(String[] args) {
        
	    String num1 = "99988499499994994999949944444444499499499949947747747747778848777746666467747474";
		String num2 = "12882889200002992882882888882777488484994999949948849947747749928837747488488884";
		//add
		BigInteger firstNum = new BigInteger(num1);
		BigInteger secondNum = new BigInteger(num2);
		BigInteger result = firstNum.add(secondNum);
		System.out.println(result);
		 
	}

}
