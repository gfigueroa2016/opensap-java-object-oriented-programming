class Robot {
    boolean hasTask;
    boolean batteryEmpty;
    int taskCounter;

    void helpDuke() {
        // In the following if-conditions, the expressions are missing, also the attribute 
        //changes as well as the output texts. 
        // Add the required conditions, the statements and add the outputs 
        //"I am pleased to do that for you.", 
        //"Duke! I need a break... Please ask again later!", "I have nothing to do."
        // and "I recharge my battery." where appropriate.
        
        if (batteryEmpty == true) {
    		System.out.println("I recharge my battery.");
    		batteryEmpty = false;
        } else if (hasTask == true && taskCounter < 3) {
    		System.out.println("I am pleased to do that for you.");
    		taskCounter++;
    	} else if (hasTask == true && taskCounter == 3) {
    		System.out.println("Duke! I need a break… Please ask again later!");
    		taskCounter -= 3;
    	} else {
    	    System.out.println("I have nothing to do.");
    	} 
    }
}
