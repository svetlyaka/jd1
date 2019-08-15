package by.htp.solution02;

import java.util.Scanner;

/**
 * Вычислить значение функции
 *
 */
public class Task40 {

	public static void main(String[] args) {

		double x;
		double result;
		System.out.print("Enter x: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		if (x <= 13) {
			result = -Math.pow(x, 3) + 9;
		} else {
			result = -3 * Math.pow(x + 1, -1);
		}
		System.out.println("Result: " + result);
		sc.close();
	}

}
