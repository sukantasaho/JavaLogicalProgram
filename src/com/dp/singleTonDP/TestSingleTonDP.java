package com.dp.singleTonDP;

public class TestSingleTonDP {

	public static void main(String[] args) {
		SingleTonDesignPattern s = SingleTonDesignPattern.getInstance();
        System.out.println(s.greeting("Sukanta"));
        System.out.println(s.hashCode());
        
        SingleTonDesignPattern s1 = SingleTonDesignPattern.getInstance();
        System.out.println(s1.greeting("Manoj"));
        System.out.println(s1.hashCode());
	}

}
