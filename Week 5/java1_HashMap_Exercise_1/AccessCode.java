class AccessCode {

	private int numberOfTimesUsed;
	private String lastTimeUsed;
	private boolean valid;

	public AccessCode(int numberOfTimesUsed, String lastTimeUsed) {
		this.numberOfTimesUsed = numberOfTimesUsed;
		this.lastTimeUsed = lastTimeUsed;
		this.valid = true;
	}
	
	public int getNumberOfTimesUsed() {
		return numberOfTimesUsed;
	}

	public void setNumberOfTimesUsed(int numberOfTimesUsed) {
		this.numberOfTimesUsed = numberOfTimesUsed;
	}

	public String getLastTimeUsed() {
		return lastTimeUsed;
	}

	public void setLastTimeUsed(String lastTimeUsed) {
		this.lastTimeUsed = lastTimeUsed;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	

}
