package com.sahoo.java7;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindTop1LargestOccurences {

	public static void main(String[] args) {
		 Map<String,Integer> map = Map.of("sukanta",20,"manoj",30,"mukti",10,"raja",34,"santosh",45);
		 List<Integer> list = map.entrySet().stream().map(e->e.getValue()).sorted(Collections.reverseOrder()).toList();
         //System.out.println(list);
		 Map<String, Integer> lhs = new LinkedHashMap<String, Integer>();
		 int top = 1;
		 for(Map.Entry entry : map.entrySet())
		 {
			  for(int i = 0; i<top; i++ )
			  {
				  if(entry.getValue()==list.get(i))
				  {
					  lhs.put((String)entry.getKey(), (Integer)entry.getValue());
				  }
			  }
		 }
		 System.out.println(lhs);
	}

}
