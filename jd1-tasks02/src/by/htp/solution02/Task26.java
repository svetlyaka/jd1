package by.htp.solution02;

import java.util.Scanner;

/**
 * Написать программу нахождения суммы большего и меньшего из трех чисел.
 *
 */
public class Task26 {

	public static void main(String[] args) {
		int a, b, c, result, max, min;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
		System.out.print("Enter c: ");
		c = sc.nextInt();
		max = MathUtils.getMax(a, MathUtils.getMax(b, c));
		min = MathUtils.getMin(a, MathUtils.getMin(b, c));
		result = max + min;
		System.out.println("Result is " + result);
		sc.close();
	}

}
