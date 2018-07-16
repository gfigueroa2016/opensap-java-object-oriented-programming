public class Story {
	public static void main(final String args[]) {
		Calculator calculator = new Calculator();
		System.out.println("a = 2, b = 3: " + calculator.div("2", "3"));
		System.out.println("a = 6.6, b = 2: " + calculator.div("6.6", "2"));
		System.out.println("a = 1.0, b = 1: " + calculator.div("1.0", "1"));
		System.out.println("a = 5, b = 2.5: " + calculator.div("5", "2.5"));
	}
}
