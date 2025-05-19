package com.sahoo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord {

	public static void main(String[] args) {
     
		//reverse word
		String input = "I am Java         Developer";
		System.out.println("Input ::"+input);
		List<String> words = Arrays.asList(input.split("\\s+"));
		Collections.reverse(words);
		//String reversed =  String.join(" ", words);
		String reversed = words.stream().collect(Collectors.joining(" "));
		System.out.println("Output::"+reversed);
		
		//reversing each word
		String output = Arrays.stream(input.split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        // Output the result
        System.out.println("Reversed Each Word::"+output);
        
       //using stream api to reverse
       String output1 = Stream.of(input).map(w-> new StringBuilder(w).reverse()).collect(Collectors.joining()).replaceAll("\\s+", " ");
       System.out.println(output1);
         
	}

}
