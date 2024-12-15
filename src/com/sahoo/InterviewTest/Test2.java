package com.sahoo.InterviewTest;

public class Test2{
	 
	public static void main(String[] args) {
		  int a1 = 10;
	      int b1 = 10;
	       Test2 t1 = new Test2();
	        t1.sum(a1, b1);
			System.out.println(a1);
			System.out.println(b1);
	       
	       int a = 10;
	       int b = 10;
	       t1.sum(a, b);
	       System.out.println(a);
	       System.out.println(b);

	}

	 public  void sum(int a1, int b1)
	   {
	         a1=10+a1;
	         b1= 10+b1;
	   }
	   public void sum(Integer a, Integer b)
	   {
	      a = 10+a;
	      b = 10+b;
	   }

  
}
