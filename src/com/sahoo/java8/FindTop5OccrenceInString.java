package com.sahoo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTop5OccrenceInString {

	public static void main(String[] args) {
		String s = "sukanta manoj mukti sukanta sukanta manoj manoj sukanta mukti raj mukti "
				+ "manoj sukanta sukanta raj anita saroj raj saroj sanjib manoj mukti manasi rajip rajip";
	Map<String,Long> map = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(map);
    List<Long> sortedValues = map.entrySet().stream().map(e->e.getValue()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
	System.out.println(sortedValues);
	int top = 5;
	Map<String, Long> lsm = new LinkedHashMap<String, Long>();
	for(Map.Entry entry : map.entrySet())
	{
		for(int i = 0; i<top; i++)
		{
			if((Long)entry.getValue() == sortedValues.get(i))
			{
				lsm.put((String)entry.getKey(), (Long)entry.getValue());
			}
		}
	}
	System.out.println(lsm);
	}

}
