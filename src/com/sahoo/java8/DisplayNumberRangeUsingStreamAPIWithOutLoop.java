package com.sahoo.java8;

import java.util.stream.IntStream;
 

public class DisplayNumberRangeUsingStreamAPIWithOutLoop {
   public static void main(String[] args) {
	   IntStream.rangeClosed(1, 11)
       .reduce((a, b) -> {
           System.out.println(a);
           return b;
       });

   }
}
