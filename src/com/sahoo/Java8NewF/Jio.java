package com.sahoo.Java8NewF;

public class Jio implements SIM {

	@Override
	public void call() {
		 System.out.println("Jio.call()");

	}

	@Override
	public void sms() {
		 System.out.println("Jio.sms()");

	}
	@Override
	public void videoCall() {
		 
		System.out.println("Jio.videoCall()");
	}

}
