package by.htp.solution02;

import java.util.Scanner;

/**
 * Найти max{min(a, b), min(c, d)}.
 *
 */
public class Task27 {

	public static void main(String[] args) {
		int a, b, c, d, result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
		System.out.print("Enter c: ");
		c = sc.nextInt();
		System.out.print("Enter d: ");
		d = sc.nextInt();
		result = MathUtils.getMax(MathUtils.getMin(a, b), MathUtils.getMin(c, d));
		System.out.println("max{min(a, b), min(c, d)} is " + result);
		sc.close();
	}

}
