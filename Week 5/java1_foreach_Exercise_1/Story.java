import java.util.ArrayList;

public class Story {

	public static void main(String[] args) {
		Office dukesOffice = new Office();
		ArrayList<String> clues = new ArrayList<String>();
		clues.add("No more hints about the stolen sword");
		clues.add("Accunium prices are at an all time high");
		clues.add("Eric gathered information on a safe deposit box in Hong Kong");
		dukesOffice.retrieveClues(clues);
	}

}
