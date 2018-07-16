class Vehicle {
	int weight;
	String name;
	String location;
	
	public Vehicle() {
	    name = "A vehicle";
	    location = "Somewhere outside";
	    weight = 1500;
	}

    void setWeight(int newWeight) {
        weight = newWeight;
    }
    
    String vehicleDetails() {
        return "The current weight of the vehicle is " + weight + " kilograms.";
    }
	
	void printInfo() {
	    System.out.println("Information of this vehicle:");
	    System.out.println("Name: " + name + ".");
	    System.out.println(vehicleDetails());
	    System.out.println("Location: " + location + ".");
	    System.out.println("---");
	}
}