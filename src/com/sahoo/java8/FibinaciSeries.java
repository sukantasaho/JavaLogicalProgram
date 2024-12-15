package com.sahoo.java8;

import java.util.stream.Stream;

public class FibinaciSeries {

	public static void main(String[] args) {
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
        .limit(5)
        .map(f -> f[0])
        .forEach(i -> System.out.print(i+" "));
		//10   1,2,3,4,5,6,7,8,9,10
		 
		

	}

}
