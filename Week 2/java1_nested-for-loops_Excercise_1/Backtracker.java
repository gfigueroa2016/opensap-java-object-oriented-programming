class Backtracker {
	
	void identifyIP(){
	    Email email = new Email();
	    String[][] array = email.ipaddress;
	    
	 
	        for(int x=0; x < array.length; x++){
	            for(int i=0; i < array[x].length; i++){
	                System.out.print(array[x][i]);
	            }
	        }
	  
	}
}
