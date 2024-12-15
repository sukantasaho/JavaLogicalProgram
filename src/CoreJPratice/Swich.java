package CoreJPratice;

import java.util.Scanner;

public class Swich {

	public static void main(String[] args) {

		int a=10, b=20, ch;
		
		System.out.println("Enter User Choice !\n");
		Scanner obj = new Scanner(System.in);
		  ch = obj.nextInt();
		  
		  switch(ch) 
		  {
		  case 1:System.out.println("Add: "+(a+b));
		     break;
		  case 2: System.out.println("Sum: "+(a-b));
		  break;
		  case 3:System.out.println("mul: "+(a*b));
		  break;
		  default: System.out.println(" Invalid Input...!");
		         
		  }
		  System.out.println(" out of Switch...");
	}

}
