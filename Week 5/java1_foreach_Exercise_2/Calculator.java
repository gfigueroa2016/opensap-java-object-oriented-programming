public class Calculator {

	int calculateSum(int[] numbers) {
		// sum up the values of all elements in numbers here and return the sum.
		int sumCalculated = 0;
		for(int sumNumber : numbers){
		    sumCalculated += sumNumber;
		}
        return sumCalculated;
	}

	double calculateMean(int[] numbers) {
		double sum = calculateSum(numbers);
		//calculate the arithmetic mean here and return it.
		return sum / numbers.length;

	}
}
