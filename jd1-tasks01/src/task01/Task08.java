
package task01;

/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения) b + √𝑏2 + 4𝑎𝑐 /2𝑎 − 𝑎3𝑐 + 𝑏−2
 */

public class Task08 {

	public static void main(String[] args) {

		double a = 1;
		double b = 1;
		double c = 2;
		double result = 0;
		result = ((b + Math.pow(Math.pow(b, 2) + 4 * a * c, 1 / 2)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.print("Result: " + result);

	}

}
