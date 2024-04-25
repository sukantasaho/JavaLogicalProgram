package com.dp.observerDP;

import java.util.ArrayList;
import java.util.List;

public class ObserverDPExample {
 
	public static void main(String[] args) {
		Follower sukanta = new Follower("Sukanta");
		Follower manoj = new Follower("Manoj");
		Follower mukti = new Follower("Mukti");
		Follower raja = new Follower("Raja");
		Follower banalaxmi = new Follower("Banalaxmi");
		
		InsuranceCompany lic = new InsuranceCompany("LIC");
		 lic.addSubscriber(sukanta);
		 lic.addSubscriber(manoj);
		
		 
		 InsuranceCompany tata = new InsuranceCompany("TATA");
		 tata.addSubscriber(mukti);
		 tata.addSubscriber(raja);
		 tata.addSubscriber(banalaxmi);
		 lic.tweet("New plan lanched on 24-apr-2024");
		  
		 tata.tweet("New plan Lanched on 10-may-2024");
		 
		
	}
	
}
//insurance
interface FollowerInterface
{
	void notification(String tweet);
}
class Follower implements FollowerInterface
{
	String name;
	public Follower(String name) {
		 this.name = name;
	}
	@Override
	public void notification(String tweet) {
		System.out.println(name+" has Notification Received "+tweet);
	}
	
}
interface ManageSubscribersAndNotify
{
	public void addSubscriber(FollowerInterface f);
	public void removeSubscriber(FollowerInterface f);
	public void notifyAllSubscribers(String tw);
}

class InsuranceCompany implements ManageSubscribersAndNotify
{

	List<FollowerInterface> subscriberList = new ArrayList<>();
	String name;
	
	public InsuranceCompany(String name)
	{
		this.name = name;
	}
	
	@Override
	public void addSubscriber(FollowerInterface f) {
		 subscriberList.add(f);
		
	}

	@Override
	public void removeSubscriber(FollowerInterface f) {
		 subscriberList.remove(f);
		
	}

	@Override
	public void notifyAllSubscribers(String tw) {
		 
		subscriberList.forEach(e->e.notification(tw));
	}
	public void tweet(String tweet)
	{
		notifyAllSubscribers(tweet);
	}
	
}