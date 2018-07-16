class Story {

	public static void main(String[] args) {
		System.out.println("The superclass of Vehicle is " + Vehicle.class.getSuperclass());
		System.out.println("The superclass of Automobile is " + Automobile.class.getSuperclass());
		System.out.println("The superclass of Car is " + Car.class.getSuperclass());
		
		/*
		Vehicle vehicle = new Vehicle();
		Automobile automobile = new Automobile();
		Car car = new Car();
		
		System.out.println();
		vehicle.printInfo();
		automobile.printInfo();
		car.printInfo();
		*/
	}

}


