/**
 * Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частно
 */
package task01;

public class Task01 {

	public static void main(String[] args) {

		double x = 4, y = 2, sum, difference, multiplication, divisionQuotient;

		sum = x + y;
		System.out.println("Sum : " + sum);

		difference = x - y;
		System.out.println("Difference : " + difference);

		multiplication = x * y;
		System.out.println("Multiplication : " + multiplication);

		divisionQuotient = x / y;
		System.out.println("Division quotient : " + divisionQuotient);
	}

}
