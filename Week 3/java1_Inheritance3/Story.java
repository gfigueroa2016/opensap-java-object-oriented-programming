class Story {
	public static void main(String args[]) {
		Car car = new Car();
		HybridCar dukesCar = new HybridCar();
		System.out.println("The normal reach of a car is " + car.getReach() + " kilometers.");
		System.out.println("Duke's hybrid car  has a reach of " + dukesCar.giveTotalBatteryReach() + " kilometers.");
	}
}
