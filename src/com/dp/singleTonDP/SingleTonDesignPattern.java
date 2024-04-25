package com.dp.singleTonDP;

public class SingleTonDesignPattern {

	private static SingleTonDesignPattern instance = null;
	
	private SingleTonDesignPattern()
	{
		
	}
	
	public static SingleTonDesignPattern getInstance()
	{
		if(instance == null)
		{
			instance = new SingleTonDesignPattern();
		}
		return instance;
	}
	public String greeting(String user)
	{
		 return "Welcome "+user;
	}
}
