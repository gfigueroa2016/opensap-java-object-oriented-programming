class Car extends Automobile {

    boolean isDriving;

	public Car() {
	    name = "Fastest Car in the World";
	    location = "A2 (german autobahn)";
	    isDriving = true;
	}
	
	@Override
	String vehicleDetails() {
	    String infoString = "The current weight of the car is " + weight + " kilograms.\n";;
	    if (isDriving) {
            infoString += "Currently it is driving. But it will park soon...\n";
            toggleDriving();
            location = "A parking lot.";
            infoString += "Now it has parked.\n";
        } else {
            infoString += "Currently the car is parking. But it will start driving soon... \n";
            toggleDriving();
            location = "A2 (german autobahn)";
            infoString += "It is back on the streets now.\n";
        }
        
        infoString += "Some more info: " + getTireCount();
        return infoString;
    }

    void toggleDriving() {
        isDriving = !isDriving;
    }
    
}
