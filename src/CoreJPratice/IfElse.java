package CoreJPratice;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		 int marks;
		System.out.println(" Enter Marks: ");
		Scanner obj = new Scanner(System.in);
		marks = obj.nextInt();
		
		if(marks>=80){
			          System.out.println(" Topper ");
		              }
		         else if(marks<80 && marks>= 60) {
		        	 System.out.println("Frist Devision.. ");
		                 }
		         else {
		        	 System.out.println("Second Devision.. ");
		              }
		
		
	}

}
