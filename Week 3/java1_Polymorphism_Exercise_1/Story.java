class Story {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new Plane();
		for (int i=0; i < vehicles.length; i++) {
			vehicles[i].printMovementDescription();
		} 
	}
}
