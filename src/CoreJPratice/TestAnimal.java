package CoreJPratice;



public class TestAnimal {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat(); d.legs();
		d.sound();
		
		System.out.println("**********************************************");
		
		Cow  c = new Cow();
		c.eat(); c.legs();
		c.sound();
		
		
		
	}

}
