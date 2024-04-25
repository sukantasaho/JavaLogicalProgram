package com.sahoo.java7;

import java.util.HashMap;
import java.util.Map;

public class DisplayDuplicateOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Map<Character, Integer> map = new HashMap();
		String str = "Rajalaxmiismydarlingandsheismylove";
		for(int i = 0; i<str.length(); i++)
		{
			
			if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), 1);
			}
			else
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		for(Map.Entry entry : map.entrySet())
		{
			int value = (int) entry.getValue();
			if(value>1)
			{
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
	}

}
