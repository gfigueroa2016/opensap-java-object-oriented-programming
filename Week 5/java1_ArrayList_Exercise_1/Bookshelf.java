import java.util.ArrayList;

class Bookshelf {
    
    ArrayList<Clue> clues = new ArrayList<Clue>();
    
    
    

	public Bookshelf() {
		Clue firstClue = new Clue();
		firstClue.setText("No more hints about the stolen sword");
		clues.add(0, firstClue);
		Clue secondClue = new Clue();
		secondClue.setText("Accunium prices are at an all time high");
		clues.add(1, secondClue);
		Clue thirdClue = new Clue();
		thirdClue.setText("Eric gathered information on a safe deposit box in Hong Kong");
		clues.add(2, thirdClue);
	}

	public String getClue(int i) {
        return clues.get(i).getText();
    }
    
    public ArrayList<Clue> getClues() {
        return clues;
    }

}
