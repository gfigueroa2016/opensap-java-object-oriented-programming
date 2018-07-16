class Car {
	private int remainingFuel = 0;

	public void setRemainingFuel(int fuel) {
	    if (notNegative(fuel)) {
		    remainingFuel = fuel;
		}
	}

	public int getRemainingFuel() {
		return remainingFuel;
	}
	
	private boolean notNegative (int fuel) {
	    return fuel >= 0 ? true : false;
	}
}
