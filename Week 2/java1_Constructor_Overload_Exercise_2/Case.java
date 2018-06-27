class Case {
    int numberOfClues;
    String[] clues = new String[10];
    

    Case(String clue) {
        numberOfClues = 1;
        clues[0] = clue;
    }
    
    Case(String clue1, String clue2){
        this("Eric broke into the museum.");
        clues[1] = clue2;
        numberOfClues = 2;
        // call the first constructor using this (don't forget the paranthesis), then assign the second clue to the array, and set the number of clues accordingly.
    }

}
