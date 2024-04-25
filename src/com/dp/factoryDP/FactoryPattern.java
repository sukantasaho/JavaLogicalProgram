package com.dp.factoryDP;

public class FactoryPattern {
   
	public static Notification createNotification(String mode)
	{
		if(mode.equalsIgnoreCase("sms"))
		{
			Notification notification = new SMSNotification();
			return notification;
		}
		if(mode.equalsIgnoreCase("push"))
		{
			Notification notification = new PushNotification();
			return notification;
		}
		if(mode.equalsIgnoreCase("email"))
		{
			Notification notification = new EmailNotification();
			return notification;
		}
			
		else 
			throw new IllegalArgumentException("Invalid Mode Notification");
	}
}
