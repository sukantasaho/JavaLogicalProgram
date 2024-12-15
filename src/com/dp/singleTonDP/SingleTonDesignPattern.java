package com.dp.singleTonDP;

public class SingleTonDesignPattern {

	private static SingleTonDesignPattern instance = null;
	
	private SingleTonDesignPattern()
	{
		
	}
	
	public static SingleTonDesignPattern getInstance() {
		//1000
		if (instance == null) {
			synchronized (instance) {
				if (instance== null) {
					instance = new SingleTonDesignPattern();
				}

			}

		}
		return instance;

	}
	public String greeting(String user)
	{
		 return "Welcome "+user;
	}
}
