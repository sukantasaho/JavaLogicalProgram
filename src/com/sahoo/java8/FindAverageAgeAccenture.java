package com.sahoo.java8;

import java.util.List;
import java.util.stream.Collectors;

public class FindAverageAgeAccenture {

	public static void main(String[] args) {
		 
		List<Person> peoples = List.of(new Person("John", 25),
				                       new Person("Jane", 30),
				                       new Person("Alice", 28),
				                       new Person("Jake", 35));
		Integer sumOfAges = peoples.stream().filter(e->e.getName().startsWith("J")).map(e->e.getAge()).collect(Collectors.summingInt(Integer :: intValue));
		Long count = peoples.stream().filter(e->e.getName().startsWith("J")).count();
		Double averageAge = (double) (sumOfAges/count);
		System.out.println("Average age of people with name starting with 'J' using loop: " + averageAge);
		

	}

}
