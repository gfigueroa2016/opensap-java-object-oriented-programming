class Office {
    String[] clues = {"Eric stole an orchid seed.", "Eric learned about boolean logic.", 
                        "Eric stole an ancient sword."};
                        
    public String retrieveClue(int element){
        return clues[element];
    }
    
    public void printClues(){
        for(int i=0;i<clues.length;i++){
            System.out.println(retrieveClue(i));
        }
    }
}
