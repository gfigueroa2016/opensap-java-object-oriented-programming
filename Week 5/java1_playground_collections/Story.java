import java.util.ArrayList;
import java.util.LinkedList;

public class Story {

	public static void main(String[] args) {
	    System.out.println(1.0/0.0);
		Stack stack = new Stack();
		stack.push("Tommy");
		stack.push("Robert");
		stack.push("Rafi");
		stack.push("Rolf");
		
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		
		Queue queue = new Queue();
		queue.push("Tommy");
		queue.push("Robert");
		queue.push("Rafi");
		queue.push("Rolf");
		
		System.out.println(queue.toString());
		queue.pop();
		System.out.println(queue.toString());
	}

}