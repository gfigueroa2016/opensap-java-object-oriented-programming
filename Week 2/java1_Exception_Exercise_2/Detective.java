class Detective {
	
	String[] myClues = new String[5];
	
	public void gatherClues(){
		myClues[0] = "Eric stole an orchid seed.";
		myClues[1] = "Eric learned about boolean logic.";
		myClues[2] = "Eric stole an ancient sword.";
		myClues[3] = "Eric needs Accunium mineral for batteries.";
	}
	
	public void printAllClues(){	
		for (int i = 0; i < myClues.length; i++) {
			System.out.println("My "+ (i+1) +  ". clue is: "+ myClues[i]);
		}		
	}


}