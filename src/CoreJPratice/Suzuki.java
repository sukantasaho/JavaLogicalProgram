package CoreJPratice;

public class Suzuki  extends Maruti{
	
	void Model() {
		System.out.println("Suzuki model no 0wr23y");
	}

	void Speed() {
		System.out.println("Suzuki speed for km/h 130");
	}
	public static void main(String[] args) {
		
		Suzuki sk = new Suzuki();
		sk.brand(); sk.speed(); sk.vehicleType();
	}
}
