package com.sahoo.InterviewTest;

import java.util.Comparator;

public class MyComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
    	 
    	String s1 = (String)o1;
    	String s2 = (String)o2;
    	Integer l1 = s1.length();
    	Integer l2 = s2.length();
    			
        if(l1<l2)
        {
        	return 1;
        }
        else if(l1>l2)
        {
        	return -1;
        }
    	
    	return s2.compareTo(s1);
    }
}
