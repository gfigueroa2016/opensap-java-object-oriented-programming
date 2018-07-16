public class Story {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int[] numbers = new int[] {8,7};
		System.out.println("Sum: " + calc.calculateSum(numbers));
		System.out.println("Arithmetic Mean: " + calc.calculateMean(numbers));
	}
}
