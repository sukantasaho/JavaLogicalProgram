package com.sahoo.java7;

import java.util.HashMap;
import java.util.Map;

public class FindEDFrequency {

	public static void main(String[] args) {
		String[] strings = {"education", "dedicated", "editor", "embedded"};
        int frequency = findFrequency(strings, "ed");
        System.out.println("Frequency of \"ed\": " + frequency);
    }
	public static int findFrequency(String[] strings, String substring) {
        int frequency = 0;
        for (String str : strings) {
            frequency += countOccurrences(str, substring);
        }
        return frequency;
    }
    public static int countOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substring, index)) != -1) {
            index++;
            count++;
        }
        return count;
    }

}
