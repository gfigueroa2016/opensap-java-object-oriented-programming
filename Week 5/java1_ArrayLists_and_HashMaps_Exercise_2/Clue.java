class Clue {

	private String text;
	private boolean used;

	Clue(String text, boolean used) {
		this.text = text;
		this.used = used;			
	}

	public String getText() {
		return text;
	}

	public boolean getUsed() {
		return used;
	}
	
	@Override
	public String toString() {
	    String result =  "\"" + getText() + "\"";
	    if(used){
	         result += ", this clue was already used.";
	    } else {
	         result += ", this clue was not yet used.";
	   }
	    return result; 
	}
	
}
