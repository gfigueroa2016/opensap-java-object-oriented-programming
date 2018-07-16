class Car extends Automobile {

	boolean hasTurboMode = true;

	Car() {
        this.color = "blue";
	}

	void drive() {
	    if (hasTurboMode) {
		    System.out.println("This car is " + color + " and has a turbo mode.");
	    } else {
	        System.out.println("This car is " + color + " and has no turbo mode.");
	    }
    }
}
