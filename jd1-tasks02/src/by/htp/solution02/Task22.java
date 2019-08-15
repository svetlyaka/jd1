package by.htp.solution02;

import java.util.Scanner;

/**
 * Перераспределить значения переменных х и у так, чтобы в х оказалось большее
 * из этих значений, а в y - меньшее.
 */
public class Task22 {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter y: ");
		y = sc.nextInt();
		if (x < y) {
			z = y;
			y = x;
			x = z;
		}
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		sc.close();
	}

}
