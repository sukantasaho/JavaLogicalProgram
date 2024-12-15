package com.sahoo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProblemApexonDoSquareSumIntoSingle {

	public static void main(String[] args) {
		
		//exmple String input="123"=>[1+4+9]=[14]=5 output
		String input1 = "444";//[16+16+16]=[48]=[12]=[3]
		String input2 = "555";//[25+25+25]=[75]=[12]=[3]
		String input3 = "45567899899";//[16+25+25+36+49+64+81+81+64+81+81]=[603]=[6+0+3]=[9]
		String input4 = "727772992992";//[49+4+49+49+49+4+81+81+4+81+81+4]=[536]=[5+3+6]=[14]=[5]
		int res = doSquareSumIntoSingle(input3);
		System.out.println(res);
		 
	}

	private static int doSquareSumIntoSingle(String input) {
		
		Integer sum  = input.chars().map(Character :: getNumericValue).map(i->i*i).sum();
		 
//		Integer sum = Arrays.asList(input.split("")).stream().map(e->Integer.parseInt(e)*Integer.parseInt(e))
//				.collect(Collectors.summingInt(Integer::intValue));
		 
			//int result = Stream.of(String.valueOf(sum).split("")).collect(Collectors.summingInt(Integer::parseInt));
			int length = String.valueOf(sum).length();
			 
			while(length!=1) {
				//result = Stream.of(String.valueOf(sum).split("")).collect(Collectors.summingInt(Integer::parseInt));
				sum =String.valueOf(sum).chars().map(Character :: getNumericValue).sum();
			    length = String.valueOf(sum).length();
			}
			
		 return sum;
	}
	 

}
