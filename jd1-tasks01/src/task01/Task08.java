/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * b + √𝑏2 + 4𝑎𝑐 /2𝑎 − 𝑎3𝑐 + 𝑏−2 
 */
package task01;

public class Task08 {

	public static void main(String[] args) {

		double a = 1, b = 1, c = 2, result;
		result = (b + Math.pow(Math.pow(b, 2) + 4 * a * c, 0.5)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.print("Result: " + result);

	}

}
