import java.util.LinkedList;

public class Queue {
	private LinkedList<String> queue = new LinkedList<>();
	
	public String pop() {
		return this.queue.removeFirst();
	}
	
	public void push(String s) {
		this.queue.add(s);
	}
	
	public int size() {
		return this.queue.size();
	}
	
	public String toString() {
		String newline = System.lineSeparator();
		String output = "Begin Queue" + newline;
		output += "================" + newline;
		for (String s : queue) {
			output += s + newline;
		}
		output += "================" + newline;
		output += "End Queue" + newline;
		return output;
	}
}
