class Case {
    int numberOfClues;
    String[] clues = new String[10];
    String nameOfVillain;
    double hourlyWage;
    String locationOfIncident;
    

    Case(String clue) {
        this(clue, "unknown", 32.5, "Potsdam");
    
        numberOfClues = 1;
        clues[0] = clue;
        
        nameOfVillain = "unknown";
        hourlyWage = 32.5;
        locationOfIncident = "Potsdam";
        
        // call the other constructor and pass the (former) initial values as parameters.
        // hint1: remember, the constructor call must come as the first statement.


    }
    
    Case(String clue1, String nameOfVillain, double hourlyWage, String locationOfIncident){
    
        numberOfClues = 1;
        clues[0] = clue1;
        this.nameOfVillain = nameOfVillain;
        this.hourlyWage = hourlyWage;
        this.locationOfIncident = locationOfIncident;    

    }

}
