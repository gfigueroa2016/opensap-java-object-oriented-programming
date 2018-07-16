class Car {
	private boolean isEngineRunning = false;

	public void printStatus() {
		System.out.println(isEngineRunning);
	}
	public void setEngineRunning(boolean setEngine) {
	    this.isEngineRunning = setEngine;
	}
	public boolean isEngineRunning() {
	    return this.isEngineRunning;
	}
	
}
