package by.htp.solution02;

import java.util.Scanner;

/**
 * ƒаны три числа a, b, с. ќпределить, какое из них равно d. ≈сли ни одно не
 * равно d, то найти max(d Ч a, d Ч b, d Ч c).
 */
public class Task28 {
	public static void main(String[] args) {
		int a, b, c, d = 100, result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
		System.out.print("Enter c: ");
		c = sc.nextInt();
		if (a == d) {
			System.out.println("The a number is equal d");
		} else if (b == d) {
			System.out.println("The b number is equal d");
		} else if (c == d) {
			System.out.println("The c number is equal d");
		} else {
			result = MathUtils.getMax(d - a, MathUtils.getMax(d - b, d - c));
			System.out.println("max(d Ч a, d Ч b, d Ч c) is " + result);
		}
		sc.close();
	}

}
