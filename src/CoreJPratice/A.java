package CoreJPratice;

 class A {
	
	void Show(){
		System.out.println("Hello View");
	}
}
 class B extends A{
	
	void Show(){
		super.Show();
		System.out.println("Hello Learner..");
	}
	
}