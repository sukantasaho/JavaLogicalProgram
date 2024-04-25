package com.sahoo.Java8NewF;

public interface SIM 
{
      public void call();
      public void sms();
      default void videoCall()
      {
    	  System.out.println("video call feacture");
      }
}
