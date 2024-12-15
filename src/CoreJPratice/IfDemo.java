package CoreJPratice;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
   
		int age = 0;
		System.out.println("Enter you Age: ");
		Scanner o1 = new Scanner(System.in);
		o1.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligible to Vote...");
		            }
		
		else {
			System.out.println("You are Not  eligible to Vote...");
		     }
		
	}

}
