package com.sahoo.java8;

import java.util.List;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		 List<Integer> listNum = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        
		List<Integer> primeNumList = listNum.stream().filter(number->{
        	 if(number<=1)
        	 {
        		 return false;
        	 }
        	 for (int i = 2; i * i <= number; i++) {
                 if (number % i == 0) {
                     return false;
                 }
             }
             return true;
         }).toList();
		
		System.out.println(primeNumList);
	}

}
