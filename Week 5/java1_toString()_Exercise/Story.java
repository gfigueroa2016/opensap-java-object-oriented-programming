public class Story {

	public static void main(String[] args) {
		Car dukesCar = new Car("DetectiveMotors", "P-HP-600", 7);
		Car ericsCar = new Car("EvilCorp", "E-VI-1", 2);
		System.out.println(dukesCar.toString());
		System.out.println(ericsCar.toString()); 
	}
}
