public class Calculator {
	public double div(String a, String b) {
		double result = 0.0;

		double aDouble = Double.parseDouble(a);
		double bDouble = Double.parseDouble(b);

		double intermediateResult = aDouble / bDouble;
		result = intermediateResult / (double) 2;

		return result;
	}
}
