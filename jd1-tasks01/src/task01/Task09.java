/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * a/c * b/d - (a*b-c)/(c*d)
 */
package task01;

public class Task09 {

	public static void main(String[] args) {

		double a = 1, b = 1, c = 2, d = 2, result;
		result = (a / c) * (b / d) - (a * b - c) / (c * d);
		System.out.print("Result: " + result);
	}

}
