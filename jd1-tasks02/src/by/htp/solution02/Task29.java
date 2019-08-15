package by.htp.solution02;

import java.util.Scanner;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
 * расположены на одной прямой.
 *
 */
public class Task29 {
	public static void main(String[] args) {
		int x1, x2, x3, y1, y2, y3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1: ");
		x1 = sc.nextInt();
		System.out.print("Enter y1: ");
		y1 = sc.nextInt();
		System.out.print("Enter x2: ");
		x2 = sc.nextInt();
		System.out.print("Enter y2: ");
		y2 = sc.nextInt();
		System.out.print("Enter x3: ");
		x3 = sc.nextInt();
		System.out.print("Enter y3: ");
		y3 = sc.nextInt();
		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
			System.out.println("Point А(х1,у1), В(х2,у2) и С(х3,у3) are located on a one line");
		} else {
			System.out.println("Point А(х1,у1), В(х2,у2) и С(х3,у3) aren't located on a one line");
		}
		sc.close();
	}

}
