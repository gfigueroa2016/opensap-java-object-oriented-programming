import java.util.ArrayList;
import java.util.HashMap;

class Bookshelf {
    ArrayList<Clue> usedClues = new ArrayList<>(); 
    ArrayList<Clue> unusedClues = new ArrayList<>(); 
    HashMap<String, ArrayList<Clue>> clueHashMap = new HashMap<>();
    
   void saveClues(ArrayList<Clue> clue) {
       int clueSize = clue.size();
        for (int i=0; i<clueSize; i++) {
            Clue addThisClue = clue.get(i);
            if (addThisClue.getUsed()) {
                usedClues.add(addThisClue);
            } else {
                unusedClues.add(addThisClue);
            }
        }
    }

	void buildHashMap() {
	    clueHashMap.put("used", usedClues);     
        clueHashMap.put("unused", unusedClues);
	}
	
	
	// please just leave this code as it is,
	// it helps you to get an output if you run your code.
	// Also, it might server as a reference for using a foreach loop. ;-)
	void printHashMap(){
	    for (String key : clueHashMap.keySet()){
	        System.out.println("The clue list \""  + key + "\" contains the clues:");
	        for(Clue clue : clueHashMap.get(key)){
	            System.out.println("\t" + clue);
	        }
	    }
	}

}
