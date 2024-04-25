package com.dp.factoryDP;

public class TestFactoryDP {

	public static void main(String[] args) {
		Notification sms = FactoryPattern.createNotification("sms");
		sms.notify1();
		
		Notification push = FactoryPattern.createNotification("push");
		push.notify1();
		
		
	}

}
