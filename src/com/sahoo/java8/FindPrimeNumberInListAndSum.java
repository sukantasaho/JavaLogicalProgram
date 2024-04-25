package com.sahoo.java8;

import java.util.List;

public class FindPrimeNumberInListAndSum {

	public static void main(String[] args) {
		List<Integer> givenList = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumPrimeNumbers = findPrimesInList(givenList);
        System.out.println("Sum Of Prime Numbers : " + sumPrimeNumbers);
	}
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findPrimesInList(List<Integer> numbers) {
       int sumPrimeNums = numbers.stream()
                .filter(FindPrimeNumberInListAndSum::isPrime)
                .reduce(0, Integer::sum);
        return sumPrimeNums;
    }

}
