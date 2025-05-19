package com.sahoo.java7;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumberNewTechinique {

	public static void main(String[] args) {
        
		int[] arr = {3,2,5,6,8,9,12,34,43,21,35,78,876,65,32,21,23,45,67,89};
		List<Integer> primeList = new ArrayList<>();
		//int count = 0;
		for(int i = 0; i<arr.length; i++) {
		       	if(isPrime(arr[i])) {
		       		//count++;
		       		primeList.add(arr[i]);
		       	}
		       	
		}
		// Second pass: Store prime numbers in primitive array
       /* int[] primeArray = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeArray[index++] = arr[i];
            }
        }

        // Print result
        System.out.print("Prime Number Array: ");
        for (int prime : primeArray) {
            System.out.print(prime + " ");
        }*/
		//System.out.println("Prime Number List::"+primeList);
	}
	public static boolean isPrime(int n) {
	
		if(n<=1)
			return false;
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n % i==0) {
				return false;
			}
		}
		return true;
	}

}
