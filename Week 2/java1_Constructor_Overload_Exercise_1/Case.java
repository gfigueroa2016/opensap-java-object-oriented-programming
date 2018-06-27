class Case {
    int numberOfClues;
    String[] clues = new String[10];
    

    Case(String clue) {
        numberOfClues = 1;
        clues[0] = clue;
    }
    
    Case(String clue1, String clue2){
        numberOfClues = 2;
        clues[0] = clue1;
        clues[1] = clue2;
        // assigns the clues to the array and set the number of clues accordingly.
    }

}
