class Story {
	public static void main(String args[]) {
		Car car = new Car();
		car.setEngineRunning(true);
		System.out.println(car.isEngineRunning());
		car.printStatus();
		car.setEngineRunning(false);
		System.out.println(car.isEngineRunning());
		car.printStatus();
	}
}
