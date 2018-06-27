public class Story {
	
	public static void main(String[] args){
		
		// Please leave these lines of code as they currently are.
		// reversedArray contains the words of the message in reversed order.
		String[] reversedArray = HiddenArray.getArray();
		
		// implement your solution below
		for (int i = reversedArray.length - 1; i >= 0; i--) {
			System.out.print(reversedArray[i] + " ");
		}
		
	}


}
