package CoreJPratice;

public class NoPerameterConstroter {

	String Course;

	public NoPerameterConstroter(){
		Course="java";
		System.out.println(" NO Perameter Constructors  call ");
	}
	
	public NoPerameterConstroter(String Course){
		this.Course=Course;
		System.out.println(" NO Perameter Constructors  call ");
	}


	public boolean Intership() {
		System.out.println("Appling for Intership method");
		return  true;
	}
	public static void main(String[] args) {
		NoPerameterConstroter cxn = new NoPerameterConstroter("java");
		System.out.println("Course:"+cxn.Course);
		NoPerameterConstroter cxn1 = new NoPerameterConstroter("Spring boot");
		System.out.println("Course:"+cxn1.Course);
		NoPerameterConstroter cxn2 = new NoPerameterConstroter("C++");
		System.out.println("Course:"+cxn2.Course);
	}
	}		