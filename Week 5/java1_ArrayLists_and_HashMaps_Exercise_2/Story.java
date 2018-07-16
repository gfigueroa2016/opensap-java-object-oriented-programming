import java.util.ArrayList;

class Story {

	public static void main(String[] args) {
		// create an ArrayList of all clues
		ArrayList<Clue> clues = new ArrayList<>();
		Clue clue1 = new Clue("Eric bought books about logic", true);
		Clue clue2 = new Clue("The flower seed was stolen from the museum", true);
		Clue clue3 = new Clue("There is a reward on Erics head", false);
		Clue clue4 = new Clue("Accunium prices are at an all time high", false);
		
		// add all the clues to the ArrayList clues
		clues.add(clue1);
		clues.add(clue2);
		clues.add(clue3);
		clues.add(clue4);
		
		// create an empty Bookshelf
		Bookshelf shelf = new Bookshelf();
		
		// save the clues in the Bookshelf
		shelf.saveClues(clues);
		
		//build the Hashmap
		shelf.buildHashMap();
		
		// print out the HashMap of Bookshelf
		shelf.printHashMap();
		
	}
}
