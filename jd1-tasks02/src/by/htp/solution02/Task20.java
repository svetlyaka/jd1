package by.htp.solution02;

import java.util.Scanner;

/**
 * ќпределить, делителем каких чисел а, b, с €вл€етс€ число k.
 *
 */
public class Task20 {

	public static void main(String[] args) {
		int x, y, z, k = 2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter y: ");
		y = sc.nextInt();
		System.out.print("Enter z: ");
		z = sc.nextInt();
		if (x % k == 0) {
			System.out.println("k is the divisor of x number");
		}
		if (y % k == 0) {
			System.out.println("k is the divisor of y number");
		}
		if (z % k == 0) {
			System.out.println("k is the divisor of z number");
		}
		sc.close();
	}

}
