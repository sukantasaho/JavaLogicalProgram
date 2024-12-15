package CoreJPratice;

public class NestedIfElse {

	public static void main(String[] args) {

		
		int a=10, b=2, c=3;
		
		
		if(a>b){ 
			    if(a>c) { 
			    	System.out.println(" A>B"+a);
			         } 
			      else{
			    	System.out.println(" A>C" +c);
			          }
		    }
		else{
			if(b>c) {
				System.out.println( " b>c" +b);
			    }
			else {
				System.out.println(c);
			}
		   }
		
		
	}

}
