package com.sahoo.thread;

public class Test1 {

	public static void main(String[] args) {
		 MyThread t1 = new MyThread();
		 MyThread t2 = new MyThread();
		
		 t1.start();
		 t2.start();
		 int p1 = t1.getPriority();
	     int p2 = t2.getPriority();
	     
         System.out.println(p1 + "  "+ p2);
         for(int i = 11; i<=20; i++)
         {
        	 System.out.println(Thread.currentThread().getName()+" "+i);
         }
         
	}

}
