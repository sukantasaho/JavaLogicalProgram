package com.sahoo.Java8NewF;

public class Airtel implements SIM {

	@Override
	public void call() {
		 System.out.println("Airtel.call()");
	}

	@Override
	public void sms() {
		 System.out.println("Airtel.sms()");

	}

}
