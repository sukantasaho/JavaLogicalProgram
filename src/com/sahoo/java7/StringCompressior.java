package com.sahoo.java7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCompressior {

	public static void main(String[] args) {
        String s = "aaabbbccccc";
        String out;
        
      StringBuilder sb = new StringBuilder();
        
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        // Append the last character and its count
        sb.append(s.charAt(s.length() - 1));
        sb.append(count);
        out = sb.toString();
        System.out.println(out); // Output: a3b3c5
        
        //approach-2
        Map<Character, Long> map = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(e->e, Collectors.counting()));
        
        System.out.println(map);
        String out1 = "";
        for(Map.Entry<Character, Long> entrySet : map.entrySet()) {
        	   Character ch = entrySet.getKey();
               long v = entrySet.getValue();
               out1 = out1+ch+v;
        }
        System.out.println(out1);
         
	}

}
