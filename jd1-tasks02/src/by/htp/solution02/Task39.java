package by.htp.solution02;

import java.util.Scanner;

/**
 * ��������� �������� �������
 *
 */
public class Task39 {

	public static void main(String[] args) {

		double x;
		double result;
		System.out.print("Enter x: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		if (x >= 8) {
			result = -Math.pow(x, 2) + x - 9;
		} else {
			result = Math.pow(Math.pow(x, 4) - 6, -1);
		}
		System.out.println("Result: " + result);
		sc.close();
	}

}
