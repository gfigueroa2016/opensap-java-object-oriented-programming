class Automobile extends Vehicle {

    int tires = 4;

	public Automobile() {
	    name = "Automobile";
	    location = "The parking lot";
	    setWeight(1000);
	}

	String getTireCount() {
		 return "It has further " + tires + " tires.";
	}
	
	@Override
	String vehicleDetails() {
	    String infoString = "The current weight of the automobile is " + weight + " kilograms.\n";
        infoString += getTireCount();
        
        return infoString;
    }

}
