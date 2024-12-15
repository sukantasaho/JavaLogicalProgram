package com.sahoo.java7;

public class SumUsingRecurrsiveMethod {

	public static void main(String[] args) {
		//1,2,3,4,5,6,7,8,9,10
		 int result = sum(10);
         System.out.println(result);
        //user defined 
        int res =  sum(5,10);
        System.out.println(res);
	}
	public static int sum(int k)
	{
		if(k>0) {
			return k+sum(k-1);
		}
		else 
			return 0;
	}
	public static int sum(int start, int end)
	{
		if(end>start)
		{
			return end+sum(start,end-1);
		}
		else
			return end;
	}

}
