package com.sahoo.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindPersonAge {

	public static void main(String[] args) {
		LocalDate birthDay = LocalDate.of(1992, 05, 10);
        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthDay, today));

	}

}
