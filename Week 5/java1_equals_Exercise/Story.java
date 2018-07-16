public class Story {

	public static void main(String[] args) {
		Car dukesCar = new Car("DetectiveCars", 5, 3.5);
		Car ericsCar = new Car("EvilCorp", 4, 2.5);
		Car musonsCar = new Car("DetectiveCars", 5, 3.5);
		System.out.println(dukesCar.equals(ericsCar));
		System.out.println(dukesCar.equals(musonsCar)); 
	}
}
