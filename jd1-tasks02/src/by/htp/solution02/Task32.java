package by.htp.solution02;

import java.util.Scanner;

/**
 * Ќаписать программу, котора€ по заданным трем числам определ€ет, €вл€етс€ ли
 * сумма каких-либо двух из них положительной.
 *
 */
public class Task32 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
		System.out.print("Enter c: ");
		c = sc.nextInt();
		if ((a + b) > 0 || (b + c) > 0 || (a + c) > 0) {
			System.out.println("The sum of any two of a,b,c is positive ");
		} else {
			System.out.println("The sum of any two of a,b,c isn't positive ");
		}
		sc.close();
	}

}
