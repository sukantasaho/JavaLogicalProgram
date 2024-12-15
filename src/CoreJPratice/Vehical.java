package CoreJPratice;

public interface Vehical {
	
	String name="Hero";
	int speed=100;
	
	void start();
	void stop();
	
	default void color() { 
		System.out.println("TVS color is red...");
	}
	static void speed(){
		
		System.out.println("TVS speed km/H");
	}
	

}
