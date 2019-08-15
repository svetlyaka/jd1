package by.htp.solution02;

import java.util.Scanner;

/**
 * Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
 * заменить их абсолютными значениями, если это не так.
 */
public class Task30 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
		System.out.print("Enter c: ");
		c = sc.nextInt();
		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println("Result: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		sc.close();
	}

}
