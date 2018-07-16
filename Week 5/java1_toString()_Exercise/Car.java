public class Car {

	private String brand;
	private String licensePlate;
	private int age;

	Car(String brand, String licensePlate, int age) {
		this.brand = brand;
		this.licensePlate = licensePlate;
		this.age = age;
	}
	public String toString() {
	    return this.brand + "_" + this.licensePlate + "_" + this.age;	
	}
}
