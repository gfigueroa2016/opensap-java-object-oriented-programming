class Story {

	public static void main(String[] args) {
		GasStation station = new GasStation();
		Car car = new Car();
		Truck truck = new Truck();
		station.refuelVehicle(car);
		System.out.println(car.remainingFuel);
		station.refuelVehicle(truck);
		System.out.println(truck.remainingFuel);
	}

}
