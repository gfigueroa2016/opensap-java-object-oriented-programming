class Story {

	public static void main(String[] args) {
		Car car = new Car();
		car.setRemainingFuel(-1);
		System.out.println(car.getRemainingFuel());
		car.setRemainingFuel(40);
		System.out.println(car.getRemainingFuel());
	}
}
