class Office {

    // The clues (clue1 to clue3) are represented as Strings
    String clue1 = "Eric stole an orchid seed.";
    String clue2 = "Eric learned about boolean logic.";
    String clue3 = "Eric stole an ancient sword.";
    
    /* Duke prefers storing the clues within an array. Therefore, please assign them.
     * For this, first create an array that can hold the respective number of Strings.
     * Recap: There are two ways to do this.
     * Option 1 (definition, possible everywhere):      String[] myArray = new String[numberOfElements];
     * Option 2 (declaration and assignment):   
     *    (declaration: possible everywhere)            String[] myArray;
     *    (assignment: possible only within methods)    myArray = new String[numberOfElements];
     */
    String[] clues;
    
    // Afterwards, save the clues within the array, by assigning them at the respective positions.
    // The order is important here (so first clue1, then clue2 and clue3).
    void saveClues(){
        clues = new String[3];
        clues[0] = clue1;
        clues[1] = clue2;
        clues[2] = clue3;
    }
}
