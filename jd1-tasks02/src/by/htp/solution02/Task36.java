package by.htp.solution02;

import java.util.Scanner;

/**
 * Вычислить значение функции:
 *
 */
public class Task36 {

	public static void main(String[] args) {

		double x;
		double result;
		System.out.print("Enter x: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		if (x <= 3) {
			result = Math.pow(x, 2) - 3 * x + 9;
		} else {
			result = Math.pow(Math.pow(x, 3) + 6, -1);
		}
		System.out.println("Result: " + result);
		sc.close();
	}
}
