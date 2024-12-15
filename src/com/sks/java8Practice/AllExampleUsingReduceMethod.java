package com.sks.java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AllExampleUsingReduceMethod {

	public static void main(String[] args) {
		
		// reduce method is a terminal operation 
		//Reducing is the process of combining all elements
		
		//Sum of elements by using reduce method
		List<Integer> numbersList = List.of(1,2,3,4,5);
		//1st approach using reduce method
		Optional<Integer> opt = numbersList.stream().reduce((e1,e2)->e1+e2);
		opt.ifPresent(System.out::println);
		
		//product the all elements
		Optional<Integer> prodOpt = numbersList.stream().reduce((e1,e2)->e1*e2);
		prodOpt.ifPresent(System.out::println);
		
		 String[] fruits = {"banana", "apple", "mango","pineapple","pomegranate"};
		 //find which one largest string
		 Optional<String> largestString = Arrays.asList(fruits).stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2);
		 largestString.ifPresent(System.out::println);
		 
		 //combining all string into single
		 List<String> wishMessageList = List.of("Welcome","To","Sukanta");
		 String wish = wishMessageList.stream().reduce((word1,word2)->word1+"--"+word2).get();
		 System.out.println(wish);
		
		
		

	}

}
