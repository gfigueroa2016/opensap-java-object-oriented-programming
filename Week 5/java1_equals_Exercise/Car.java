public class Car {

	private String brand;
	private int age;
	private double remainingFuel;

	Car(String brand, int age, double remainingFuel) {
		this.brand = brand;
		this.age = age;
		this.remainingFuel = remainingFuel;
	}
	public boolean equals(Object o){
	    boolean result = false;
	    if (o != null && o instanceof Car){
	        Car car2 = (Car) o;
	        result = this.brand.equals(car2.brand) && this.age == car2.age &&
	        this.remainingFuel == car2.remainingFuel;
	    }
	    return result;
	}
}
