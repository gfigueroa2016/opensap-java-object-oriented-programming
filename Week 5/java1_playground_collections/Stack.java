import java.util.LinkedList;

public class Stack {
	private LinkedList<String> stack = new LinkedList<>();
	
	public String pop() {
		return this.stack.removeLast();
	}
	
	public void push(String s) {
		this.stack.add(s);
	}
	
	public int size() {
		return this.stack.size();
	}
	
	public String toString() {
		String newline = System.lineSeparator();
		String output = "Begin Stack" + newline;
		output += "================" + newline;
		for (String s : stack) {
			output += s + newline;
		}
		output += "================" + newline;
		output += "End Stack" + newline;
		return output;
	}
}
