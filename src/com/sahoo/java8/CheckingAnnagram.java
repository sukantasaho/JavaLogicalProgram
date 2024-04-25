package com.sahoo.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckingAnnagram {

	public static void main(String[] args) {
		 String s1 = "Listen";
		 String s2 = "silent";
		 s1 = Stream.of(s1.split("")).map(String :: toLowerCase).sorted().collect(Collectors.joining());
		 s2 = Stream.of(s2.split("")).map(String :: toLowerCase).sorted().collect(Collectors.joining());
		  
		 if(s1.length()!=s2.length())
		 {
			 System.out.println("This is not annagram");
		 }
		 if(s1.equals(s2))
		 {
			 System.out.println("This is annagram");
		 }
		 else
		 {
			 System.out.println("This is not annagram");
		 }

	}

}
