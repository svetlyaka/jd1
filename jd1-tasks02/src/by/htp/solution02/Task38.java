package by.htp.solution02;

import java.util.Scanner;

/**
 * Вычислить значение функци
 *
 */
public class Task38 {

	public static void main(String[] args) {

		double x;
		double result;
		System.out.print("Enter x: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		if ((x >= 0) && (x <= 3)) {
			result = Math.pow(x, 2);
		} else {
			result = 4;
		}
		System.out.println("Result: " + result);
		sc.close();
	}

}
