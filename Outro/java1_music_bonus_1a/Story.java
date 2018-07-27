public class Story {
	
	public static void main(String[] args){
	    for(int i = 1; i <= 50; i++){
	        if (i % 3 == 0 && i % 7 == 0) {
	            System.out.println("ding-dong");
	        } else if (i % 3 == 0) {
	            System.out.println("ding");
	        } else if (i % 7 == 0) {
	            System.out.println("dong");
	        } else {
	            System.out.println("ping");
	        }
	    }
	 }
}