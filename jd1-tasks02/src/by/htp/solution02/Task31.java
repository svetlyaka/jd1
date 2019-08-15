package by.htp.solution02;

import java.util.Scanner;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Task31 {
	public static void main(String[] args) {
		int a, b, x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter y: ");
		y = sc.nextInt();
		System.out.print("Enter z: ");
		z = sc.nextInt();
		if ((x <= a && y <= b) || (y <= a && x <= b) || (x <= a && z <= b) || (z <= a && x <= b) || (y <= a && z <= b)
				|| (z <= a && y <= b)) {
			System.out.print("The brick could pass through the hole");
		} else {
			System.out.print("The brick couldn't pass through the hole");
		}
		sc.close();
	}

}
